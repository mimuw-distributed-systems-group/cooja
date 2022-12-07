package org.contikios.cooja.dialogs;

import java.io.OutputStream;

public interface MessageList {

    int NORMAL = 0;
    int WARNING = 1;
    int ERROR = 2;
    
    MessageContainer[] getMessages();

    void clearMessages();

    void addMessage(String string);

    void addMessage(String string, int normal);

    OutputStream getInputStream(int type);

}
