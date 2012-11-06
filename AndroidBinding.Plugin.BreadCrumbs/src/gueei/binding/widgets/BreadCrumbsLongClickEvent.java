package gueei.binding.widgets;

public class BreadCrumbsLongClickEvent {
	public final int rowPosition;
	public final Object breadCrumbNode;
	
	public BreadCrumbsLongClickEvent(int rowPosition, Object breadCrumbNode) {
		this.rowPosition = rowPosition;
		this.breadCrumbNode = breadCrumbNode;		
	}
}
