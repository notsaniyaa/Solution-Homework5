# Java Design Patterns Project – Proxy & Flyweight

## Overview

This project demonstrates two structural design patterns implemented in Java:

Explanations
## Proxy Pattern – Image Loading System
Problem Solved:
High-resolution images are heavy and slow to load, especially when browsing property listings. Users want a fast experience with immediate thumbnails and full images only when needed. Also, not everyone should be allowed to upload or replace images.

How the Pattern Helped:
The Proxy Pattern was used to delay loading full-resolution images until the user explicitly requests it (lazy loading). The ImageProxy class ensures thumbnails load instantly and the full image loads only once when needed. Additionally, a protection proxy (AgentImageUploader) checks whether the user is logged in before allowing uploads. This improves performance and adds access control logic without modifying the core image logic.

## Flyweight Pattern – Map Marker Rendering
Problem Solved:
Rendering thousands of map markers with individual icons, colors, and label styles would consume a large amount of memory. However, many markers use the same style (e.g., hospitals with the same icon and color), leading to data redundancy.

How the Pattern Helped:
The Flyweight Pattern reduced memory usage by sharing style objects between markers. Instead of creating 10,000 separate MarkerStyle objects, only 6 were created and reused among all Marker objects. This improves efficiency without changing functionality. The pattern separates intrinsic data (style) from extrinsic data (position), allowing massive scaling with minimal memory overhead.

---

## 1. Proxy Pattern – Image Management System

 **Scenario**:  
Real estate agents upload high-resolution property images, but the website should only load full-resolution images when the user clicks to zoom. Thumbnails are shown immediately.

Classes:
- Image – interface (Subject)
- RealImage – actual image object (RealSubject)
- ImageProxy – proxy that delays loading
- AgentImageUploader – protection proxy that restricts upload to logged-in agents

**Usage Example**:

Image img = new ImageProxy("house1.jpg");
img.displayThumbnail();      
img.displayFullImage();     

AgentImageUploader uploader = new AgentImageUploader(true);
uploader.uploadImage("villa.jpg");


Code Location: proxy/
Entry Point: Main.java


![image](https://github.com/user-attachments/assets/d158ea62-ddd8-4986-ba71-a4ae0bc77b07)


## 2. Flyweight Pattern – Map Marker Optimization

 **Scenario**: 
A map application renders thousands of location markers (gas stations, hospitals, restaurants). These share common styles (icons, colors, labels). The goal is to avoid duplicating style data.

**Classes:**

- MarkerStyle – the shared flyweight object

- MarkerStyleFactory – factory that caches and returns shared styles

- Marker – a map marker with unique coordinates and a shared style

**Highlights:**


- 10,000 markers created

- Only 6 unique style objects reused

- Logs memory efficiency stats



Code Location: flyweight/

Entry Point: flyweight/MapRenderer.java


![image](https://github.com/user-attachments/assets/3188b44b-cb72-45d2-96dd-bb6f6bd15a88)
