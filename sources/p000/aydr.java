package p000;

import android.util.Log;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Locale;

/* renamed from: aydr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aydr extends Thread {

    /* renamed from: a */
    private final boolean f97246a;

    /* renamed from: b */
    private final aydp f97247b;

    /* renamed from: c */
    private final ConnectionConfiguration f97248c;

    /* renamed from: d */
    private volatile ServerSocket f97249d;

    /* renamed from: e */
    private volatile Socket f97250e;

    /* JADX WARNING: Illegal instructions before constructor call */
    public aydr(boolean z, ConnectionConfiguration connectionConfiguration) {
        super(r0);
        String str;
        if (!z) {
            str = "WearableNetClientThread";
        } else {
            str = "WearableNetServerThread";
        }
        this.f97246a = z;
        this.f97247b = new aydp(3, -1, -1);
        this.f97248c = connectionConfiguration;
    }

    /* renamed from: a */
    private static final void m83862a(int i, String str) {
        m83863a(i, str, null);
    }

    /* renamed from: c */
    private final int m83864c() {
        int i;
        if (this.f97246a) {
            i = stn.m36303a("ro.emu.wear_gms_service_port");
            if (i == -1) {
                return (int) chnj.f188812a.mo6606a().mo85396V();
            }
        } else {
            i = stn.m36303a("ro.emu.wear_gms_service_port");
            if (i == -1) {
                return (int) chnj.f188812a.mo6606a().mo85397W();
            }
        }
        return i;
    }

    /* renamed from: b */
    public final void mo53970b() {
        Socket socket = this.f97250e;
        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
                String valueOf = String.valueOf(e.toString());
                Log.w("Wear_NetworkService", valueOf.length() == 0 ? new String("Exception while closing socket: ") : "Exception while closing socket: ".concat(valueOf));
            }
        }
    }

    public final void run() {
        String str;
        String str2 = (spn.m35859a() && !this.f97246a) ? "10.0.2.2" : "127.0.0.1";
        try {
            InetAddress byName = InetAddress.getByName(str2);
            try {
                if (this.f97246a) {
                    while (!isInterrupted()) {
                        try {
                            this.f97249d = new ServerSocket(m83864c(), 0, byName);
                            break;
                        } catch (IOException e) {
                            String valueOf = String.valueOf(e.toString());
                            Log.w("Wear_NetworkService", valueOf.length() == 0 ? new String("Exception while listening for connection: ") : "Exception while listening for connection: ".concat(valueOf));
                            mo53969a();
                            long b = this.f97247b.mo53967b();
                            m83862a(1, String.format(Locale.US, "Waiting %.1f seconds to retry listen", Float.valueOf(((float) b) / 1000.0f)));
                            Thread.sleep(b);
                        }
                    }
                    this.f97247b.mo53966a();
                }
                while (!isInterrupted()) {
                    if (!this.f97246a) {
                        str = "client";
                    } else {
                        str = "server";
                    }
                    try {
                        int c = m83864c();
                        if (!this.f97246a) {
                            aydo b2 = ayha.m83996b();
                            String valueOf2 = String.valueOf(byName);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                            sb.append("Connecting via TCP to ");
                            sb.append(valueOf2);
                            sb.append(":");
                            sb.append(c);
                            b2.mo53963a(2, sb.toString(), (Throwable) null);
                            this.f97250e = new Socket(byName, c);
                        } else {
                            aydo b3 = ayha.m83996b();
                            String valueOf3 = String.valueOf(byName);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 33);
                            sb2.append("Listening via TCP on ");
                            sb2.append(valueOf3);
                            sb2.append(":");
                            sb2.append(c);
                            b3.mo53963a(2, sb2.toString(), (Throwable) null);
                            this.f97250e = this.f97249d.accept();
                        }
                        this.f97247b.mo53966a();
                        m83862a(3, str.length() == 0 ? new String("Connected, running sync loop as ") : "Connected, running sync loop as ".concat(str));
                        ayha.m83994a().mo53853a(this.f97250e.getInputStream(), this.f97250e.getOutputStream(), this.f97248c);
                    } catch (aybe e2) {
                        m83862a(4, "Error: wire protocol version mismatch");
                        this.f97247b.mo53968c();
                    } catch (IOException e3) {
                        m83863a(1, "Error writing to device", e3);
                    } catch (axwa e4) {
                        m83862a(4, "Error: Connection attempted from incorrect client");
                        this.f97247b.mo53968c();
                    }
                    mo53970b();
                    m83862a(1, "Socket closed");
                    long b4 = this.f97247b.mo53967b();
                    m83862a(1, String.format(Locale.US, "Waiting %.1f seconds to retry connection", Float.valueOf(((float) b4) / 1000.0f)));
                    Thread.sleep(b4);
                }
            } catch (InterruptedException e5) {
                m83862a(1, "Connection interrupted, shutting down");
                interrupt();
            } catch (Exception e6) {
                try {
                    m83863a(1, "Unexpected exception, shutting down", e6);
                } catch (Throwable th) {
                    m83862a(1, "Wear OS NetworkThread finished");
                    mo53969a();
                    throw th;
                }
            } catch (Throwable th2) {
                mo53970b();
                throw th2;
            }
            m83862a(1, "Wear OS NetworkThread finished");
            mo53969a();
        } catch (UnknownHostException e7) {
            Log.w("Wear_NetworkService", str2.length() == 0 ? new String("Unknown host: ") : "Unknown host: ".concat(str2));
        }
    }

    /* renamed from: a */
    private static final void m83863a(int i, String str, Throwable th) {
        ayha.m83996b().mo53963a(i, str, th);
    }

    /* renamed from: a */
    public final void mo53969a() {
        ServerSocket serverSocket = this.f97249d;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (Exception e) {
                String valueOf = String.valueOf(e.toString());
                Log.w("Wear_NetworkService", valueOf.length() == 0 ? new String("Exception while closing server socket: ") : "Exception while closing server socket: ".concat(valueOf));
            }
        }
    }
}
