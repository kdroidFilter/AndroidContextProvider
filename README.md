# 🔧 Android Context Provider

Android Context Provider is a simple utility library that allows you to easily access the application context from anywhere in your app. This can be especially useful for situations where accessing the context in a static manner is needed.

## ✨ Features

- 🛠️ Uses 0 dependencies, making it lightweight and easy to integrate.

- 💪 Easy initialization with your application context.

- 🎮 Access the application context from any part of your code.

## 📃 Getting Started

### 🔍 Installation

The library is available on Maven Central.

To import it into your project, add the following to your `build.gradle.kts` file:

```kotlin
implementation("io.github.kdroidfilter:androidcontextprovider:1.0.1")
```

or in Groovy :
```groovy
implementation 'io.github.kdroidfilter:androidcontextprovider:1.0.1'
```

### ⏳ Usage

1. **✨ Automatic Initialization**
   The `ContextProvider` is automatically initialized using a `ContentProvider`, which means you do not need to explicitly initialize it in your `Application` class. This reduces boilerplate and ensures that the `ContextProvider` is ready to use as soon as your app launches.

2. **🔎 Getting the Context**

   You can access the application context (not an activity context) from anywhere in your app like this:
   ```kotlin
   val context = ContextProvider.getContext()
   // Use the context as needed
   ```
   or in Java :
   ```java
   Context context = ContextProvider.getContext();
   // Use the context as needed
   ```

### ⚠️ Important Notes

- **Automatic Initialization**: The `ContextProvider` is initialized automatically via `ContentProvider`, eliminating the need for manual setup.
- **Error Handling**: If you try to get the context before it is initialized, `ContextProvider` will throw an `IllegalStateException`. However, with automatic initialization, this scenario is unlikely.

## 📚 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🌐 Contributions

Contributions are welcome! If you find any issues or have improvements to suggest, feel free to open an issue or a pull request on GitHub.

