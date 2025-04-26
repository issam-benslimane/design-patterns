public class PluginFactory {
    public static Plugin createPlugin(String className) throws Exception {
        return (Plugin) Class.forName(className).newInstance();
    }
} 