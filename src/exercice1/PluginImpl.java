public abstract class PluginImpl implements Plugin {
    public final void operation() {
        partie1();
        partie2();
    }

    protected abstract void partie1();
    protected abstract void partie2();
} 