# Java Design Patterns Project – Proxy & Flyweight

## Overview

This project demonstrates two structural design patterns implemented in Java:

1. **Proxy Pattern** – for optimized image loading in a real estate image management system.
2. **Flyweight Pattern** – for memory-efficient rendering of thousands of map markers.

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
