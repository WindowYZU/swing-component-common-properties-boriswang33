/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.window_programming.componentproperties;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.ImageCapabilities;
import java.awt.MenuComponent;
import java.awt.Point;
import java.awt.PopupMenu;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.dnd.DropTarget;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.im.InputContext;
import java.awt.im.InputMethodRequests;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import java.awt.peer.ComponentPeer;
import java.beans.PropertyChangeListener;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author lendle
 */
public class PaintComponentSample extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
//To change body of generated methods, choose Tools | Templates.
       int width = this.getWidth();
       int height = this.getHeight();
       g.draw3DRect(0, 0,300 ,300 , true);
    }

    @Override
    public ComponentOrientation getComponentOrientation() {
        return super.getComponentOrientation(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setComponentOrientation(ComponentOrientation o) {
        super.setComponentOrientation(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firePropertyChange(String propertyName, double oldValue, double newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firePropertyChange(String propertyName, float oldValue, float newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firePropertyChange(String propertyName, long oldValue, long newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firePropertyChange(String propertyName, short oldValue, short newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void firePropertyChange(String propertyName, byte oldValue, byte newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        super.firePropertyChange(propertyName, oldValue, newValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropertyChangeListener[] getPropertyChangeListeners(String propertyName) {
        return super.getPropertyChangeListeners(propertyName); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        super.removePropertyChangeListener(propertyName, listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PropertyChangeListener[] getPropertyChangeListeners() {
        return super.getPropertyChangeListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        super.removePropertyChangeListener(listener); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void list(PrintWriter out) {
        super.list(out); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void list(PrintStream out) {
        super.list(out); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void list() {
        super.list(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(MenuComponent popup) {
        super.remove(popup); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(PopupMenu popup) {
        super.add(popup); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFocusOwner() {
        return super.isFocusOwner(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean hasFocus() {
        return super.hasFocus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferFocusUpCycle() {
        super.transferFocusUpCycle(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferFocusBackward() {
        super.transferFocusBackward(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nextFocus() {
        super.nextFocus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transferFocus() {
        super.transferFocus(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Container getFocusCycleRootAncestor() {
        return super.getFocusCycleRootAncestor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getFocusTraversalKeysEnabled() {
        return super.getFocusTraversalKeysEnabled(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
        super.setFocusTraversalKeysEnabled(focusTraversalKeysEnabled); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFocusable(boolean focusable) {
        super.setFocusable(focusable); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFocusable() {
        return super.isFocusable(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFocusTraversable() {
        return super.isFocusTraversable(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean lostFocus(Event evt, Object what) {
        return super.lostFocus(evt, what); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean gotFocus(Event evt, Object what) {
        return super.gotFocus(evt, what); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean action(Event evt, Object what) {
        return super.action(evt, what); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean keyUp(Event evt, int key) {
        return super.keyUp(evt, key); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean keyDown(Event evt, int key) {
        return super.keyDown(evt, key); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseExit(Event evt, int x, int y) {
        return super.mouseExit(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseEnter(Event evt, int x, int y) {
        return super.mouseEnter(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseMove(Event evt, int x, int y) {
        return super.mouseMove(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseUp(Event evt, int x, int y) {
        return super.mouseUp(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseDrag(Event evt, int x, int y) {
        return super.mouseDrag(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean mouseDown(Event evt, int x, int y) {
        return super.mouseDown(evt, x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean handleEvent(Event evt) {
        return super.handleEvent(evt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processHierarchyBoundsEvent(HierarchyEvent e) {
        super.processHierarchyBoundsEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processHierarchyEvent(HierarchyEvent e) {
        super.processHierarchyEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processInputMethodEvent(InputMethodEvent e) {
        super.processInputMethodEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processMouseWheelEvent(MouseWheelEvent e) {
        super.processMouseWheelEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processFocusEvent(FocusEvent e) {
        super.processFocusEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void processComponentEvent(ComponentEvent e) {
        super.processComponentEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected AWTEvent coalesceEvents(AWTEvent existingEvent, AWTEvent newEvent) {
        return super.coalesceEvents(existingEvent, newEvent); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InputContext getInputContext() {
        return super.getInputContext(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InputMethodRequests getInputMethodRequests() {
        return super.getInputMethodRequests(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized InputMethodListener[] getInputMethodListeners() {
        return super.getInputMethodListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeInputMethodListener(InputMethodListener l) {
        super.removeInputMethodListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addInputMethodListener(InputMethodListener l) {
        super.addInputMethodListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized MouseWheelListener[] getMouseWheelListeners() {
        return super.getMouseWheelListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeMouseWheelListener(MouseWheelListener l) {
        super.removeMouseWheelListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addMouseWheelListener(MouseWheelListener l) {
        super.addMouseWheelListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized MouseMotionListener[] getMouseMotionListeners() {
        return super.getMouseMotionListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeMouseMotionListener(MouseMotionListener l) {
        super.removeMouseMotionListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addMouseMotionListener(MouseMotionListener l) {
        super.addMouseMotionListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized MouseListener[] getMouseListeners() {
        return super.getMouseListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeMouseListener(MouseListener l) {
        super.removeMouseListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        super.addMouseListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized KeyListener[] getKeyListeners() {
        return super.getKeyListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeKeyListener(KeyListener l) {
        super.removeKeyListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addKeyListener(KeyListener l) {
        super.addKeyListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized HierarchyBoundsListener[] getHierarchyBoundsListeners() {
        return super.getHierarchyBoundsListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeHierarchyBoundsListener(HierarchyBoundsListener l) {
        super.removeHierarchyBoundsListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addHierarchyBoundsListener(HierarchyBoundsListener l) {
        super.addHierarchyBoundsListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized HierarchyListener[] getHierarchyListeners() {
        return super.getHierarchyListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeHierarchyListener(HierarchyListener l) {
        super.removeHierarchyListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addHierarchyListener(HierarchyListener l) {
        super.addHierarchyListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized FocusListener[] getFocusListeners() {
        return super.getFocusListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeFocusListener(FocusListener l) {
        super.removeFocusListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addFocusListener(FocusListener l) {
        super.addFocusListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized ComponentListener[] getComponentListeners() {
        return super.getComponentListeners(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void removeComponentListener(ComponentListener l) {
        super.removeComponentListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void addComponentListener(ComponentListener l) {
        super.addComponentListener(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean postEvent(Event e) {
        return super.postEvent(e); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Point p) {
        return super.contains(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean inside(int x, int y) {
        return super.inside(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getIgnoreRepaint() {
        return super.getIgnoreRepaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIgnoreRepaint(boolean ignoreRepaint) {
        super.setIgnoreRepaint(ignoreRepaint); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int checkImage(Image image, int width, int height, ImageObserver observer) {
        return super.checkImage(image, width, height, observer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int checkImage(Image image, ImageObserver observer) {
        return super.checkImage(image, observer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean prepareImage(Image image, int width, int height, ImageObserver observer) {
        return super.prepareImage(image, width, height, observer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean prepareImage(Image image, ImageObserver observer) {
        return super.prepareImage(image, observer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VolatileImage createVolatileImage(int width, int height, ImageCapabilities caps) throws AWTException {
        return super.createVolatileImage(width, height, caps); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public VolatileImage createVolatileImage(int width, int height) {
        return super.createVolatileImage(width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image createImage(int width, int height) {
        return super.createImage(width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Image createImage(ImageProducer producer) {
        return super.createImage(producer); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
        return super.imageUpdate(img, infoflags, x, y, w, h); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void repaint(int x, int y, int width, int height) {
        super.repaint(x, y, width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void repaint(long tm) {
        super.repaint(tm); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paintAll(Graphics g) {
        super.paintAll(g); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCursorSet() {
        return super.isCursorSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cursor getCursor() {
        return super.getCursor(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCursor(Cursor cursor) {
        super.setCursor(cursor); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMaximumSizeSet() {
        return super.isMaximumSizeSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMinimumSizeSet() {
        return super.isMinimumSizeSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isPreferredSizeSet() {
        return super.isPreferredSizeSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isLightweight() {
        return super.isLightweight(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBounds(Rectangle r) {
        super.setBounds(r); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rectangle bounds() {
        return super.bounds(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rectangle getBounds() {
        return super.getBounds(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resize(Dimension d) {
        super.resize(d); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension size() {
        return super.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Dimension getSize() {
        return super.getSize(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(Point p) {
        super.setLocation(p); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point location() {
        return super.location(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getLocationOnScreen() {
        return super.getLocationOnScreen(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getLocation() {
        return super.getLocation(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ColorModel getColorModel() {
        return super.getColorModel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLocale(Locale l) {
        super.setLocale(l); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Locale getLocale() {
        return super.getLocale(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFontSet() {
        return super.isFontSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Font getFont() {
        return super.getFont(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isBackgroundSet() {
        return super.isBackgroundSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getBackground() {
        return super.getBackground(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isForegroundSet() {
        return super.isForegroundSet(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getForeground() {
        return super.getForeground(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show(boolean b) {
        super.show(b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enableInputMethods(boolean enable) {
        super.enableInputMethods(enable); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enable(boolean b) {
        super.enable(b); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnabled() {
        return super.isEnabled(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isShowing() {
        return super.isShowing(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Point getMousePosition() throws HeadlessException {
        return super.getMousePosition(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isVisible() {
        return super.isVisible(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isDisplayable() {
        return super.isDisplayable(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isValid() {
        return super.isValid(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Toolkit getToolkit() {
        return super.getToolkit(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GraphicsConfiguration getGraphicsConfiguration() {
        return super.getGraphicsConfiguration(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized DropTarget getDropTarget() {
        return super.getDropTarget(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public synchronized void setDropTarget(DropTarget dt) {
        super.setDropTarget(dt); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComponentPeer getPeer() {
        return super.getPeer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Container getParent() {
        return super.getParent(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    //利用 paintComponent 讓 JPanel 畫出一個橢圓
    @Override    
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    //////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame=new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        PaintComponentSample c=new PaintComponentSample();
        frame.add(c);
        frame.setVisible(true);
    }
    
}
