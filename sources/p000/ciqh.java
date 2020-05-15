package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* renamed from: ciqh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ciqh {

    /* renamed from: a */
    static final Logger f191239a = Logger.getLogger(ciqh.class.getName());

    private ciqh() {
    }

    /* renamed from: a */
    public static cipv m150827a(ciqq ciqq) {
        return new ciqk(ciqq);
    }

    /* renamed from: b */
    public static ciqq m150836b(File file) {
        if (file != null) {
            return m150829a(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: c */
    private static cipr m150838c(Socket socket) {
        return new ciqg(socket);
    }

    /* renamed from: a */
    public static cipw m150828a(ciqr ciqr) {
        return new ciqm(ciqr);
    }

    /* renamed from: b */
    public static ciqr m150837b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            cipr c = m150838c(socket);
            return new cipp(c, m150834a(socket.getInputStream(), c));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: c */
    public static ciqq m150839c(File file) {
        if (file != null) {
            return m150829a(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static ciqq m150829a(OutputStream outputStream) {
        return m150830a(outputStream, new ciqt());
    }

    /* renamed from: a */
    private static ciqq m150830a(OutputStream outputStream, ciqt ciqt) {
        if (outputStream != null) {
            return new ciqe(ciqt, outputStream);
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public static ciqq m150831a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            cipr c = m150838c(socket);
            return new cipo(c, m150830a(socket.getOutputStream(), c));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    /* renamed from: a */
    public static ciqr m150832a(File file) {
        if (file != null) {
            return m150833a(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    /* renamed from: a */
    public static ciqr m150833a(InputStream inputStream) {
        return m150834a(inputStream, new ciqt());
    }

    /* renamed from: a */
    private static ciqr m150834a(InputStream inputStream, ciqt ciqt) {
        if (inputStream != null) {
            return new ciqf(ciqt, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: a */
    static boolean m150835a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
