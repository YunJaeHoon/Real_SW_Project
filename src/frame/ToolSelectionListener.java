package frame;
import java.util.EventListener;

public interface ToolSelectionListener extends EventListener {
    void toolSelected(ToolMode selectedTool);
}