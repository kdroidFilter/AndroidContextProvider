# Android Context Provider

Android Context Provider is a simple utility library that allows you to easily access the application context from anywhere in your app. This can be especially useful for situations where accessing the context in a static manner is needed.

## Features

- Easy initialization with your application context.
- Access the application context from any part of your code.

## Getting Started

### Installation

To use the `ContextProvider` in your Android project, add it as a dependency. If you are distributing it as an open-source library, you would publish it on a package repository like Maven. For now, you can add it manually to your project.

### Usage

1. **Automatic Initialization**
   The `ContextProvider` is automatically initialized using a `ContentProvider`, which means you do not need to explicitly initialize it in your `Application` class. This reduces boilerplate and ensures that the `ContextProvider` is ready to use as soon as your app launches.

2. **Getting the Context**

   You can access the application context from anywhere in your app like this:

   ```kotlin
   val context = ContextProvider.getContext()
   // Use the context as needed
   ```

### Important Notes

- **Automatic Initialization**: The `ContextProvider` is initialized automatically via `ContentProvider`, eliminating the need for manual setup.
- **Error Handling**: If you try to get the context before it is initialized, `ContextProvider` will throw an `IllegalStateException`. However, with automatic initialization, this scenario is unlikely.

## Example

Here is a complete example of how to use `ContextProvider` in an Android application:

```kotlin
// Access context anywhere
class SomeUtility {
    fun doSomething() {
        val context = ContextProvider.getContext()
        // Use the context
    }
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributions

Contributions are welcome! If you find any issues or have improvements to suggest, feel free to open an issue or a pull request on GitHub.

