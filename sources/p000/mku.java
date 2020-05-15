package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: mku */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mku extends mkn {

    /* renamed from: a */
    private final Socket f33919a;

    /* renamed from: b */
    private final OutputStream f33920b;

    /* renamed from: c */
    private final InputStream f33921c;

    mku() {
    }

    /* renamed from: a */
    public final int mo20106a(byte[] bArr, int i, int i2) {
        try {
            InputStream inputStream = this.f33921c;
            int i3 = 0;
            while (i3 < i2) {
                int read = inputStream.read(bArr, i + i3, i2 - i3);
                if (read > 0) {
                    i3 += read;
                } else if (read < 0) {
                    StringBuilder sb = new StringBuilder(35);
                    sb.append("read returned negative: ");
                    sb.append(read);
                    throw new IOException(sb.toString());
                }
            }
            return i3;
        } catch (IOException e) {
            throw new mjp("Failed to read", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20113c(byte[] bArr, int i, int i2) {
        try {
            this.f33920b.write(bArr, i, i2);
        } catch (IOException e) {
            throw new mjp("Could not write", e);
        }
    }

    public mku(int i) {
        try {
            ServerSocket serverSocket = new ServerSocket(i);
            Log.i("BackupE2E", "server listening");
            this.f33919a = serverSocket.accept();
            serverSocket.close();
            this.f33920b = this.f33919a.getOutputStream();
            this.f33921c = this.f33919a.getInputStream();
        } catch (IOException e) {
            throw new mjs("Failed to connect", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo20112a() {
        Socket socket = this.f33919a;
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
    }
}
