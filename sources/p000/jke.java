package p000;

import com.google.android.gms.auth.proximity.ConnectionInfo;
import com.google.android.gms.auth.proximity.RemoteDevice;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jke implements jnt, bluw {

    /* renamed from: a */
    public static final sek f22679a = jsy.m17256a("BleSecureChannel");

    /* renamed from: b */
    public final String f22680b;

    /* renamed from: c */
    public final blux f22681c;

    /* renamed from: d */
    public final ScheduledExecutorService f22682d;

    /* renamed from: e */
    public final Object f22683e;

    /* renamed from: f */
    public final jta f22684f;

    /* renamed from: g */
    public qxo f22685g;

    /* renamed from: h */
    public qxo f22686h;

    /* renamed from: i */
    public qxo f22687i;

    /* renamed from: j */
    public jnl f22688j;

    /* renamed from: k */
    public jmc f22689k;

    /* renamed from: l */
    public jih f22690l;

    /* renamed from: m */
    public int f22691m;

    /* renamed from: n */
    public int f22692n;

    /* renamed from: o */
    public final List f22693o;

    /* renamed from: p */
    public boolean f22694p = false;

    /* renamed from: q */
    private final blun f22695q;

    /* renamed from: r */
    private final jny f22696r;

    /* renamed from: s */
    private final boolean f22697s;

    /* renamed from: t */
    private final Set f22698t;

    /* renamed from: u */
    private final jsx f22699u;

    public jke(String str, blun blun, ScheduledExecutorService scheduledExecutorService, boolean z) {
        blux blux;
        sdo.m34959a(blun);
        this.f22680b = str;
        this.f22695q = blun;
        this.f22682d = scheduledExecutorService;
        this.f22696r = new jny(scheduledExecutorService, this);
        this.f22697s = z;
        this.f22698t = new HashSet();
        this.f22693o = new ArrayList();
        this.f22683e = new Object();
        this.f22684f = jsz.m17257a();
        this.f22699u = jsw.m17254a();
        this.f22691m = 1;
        this.f22692n = 0;
        if (z) {
            sdo.m34970a(blun instanceof blvp);
            blux = new blvx(blun, this.f22696r);
        } else {
            blux = new blvv(blun, this.f22696r);
        }
        this.f22681c = blux;
    }

    /* renamed from: a */
    public static String m16821a(int i) {
        switch (i) {
            case 0:
                return "[not waiting]";
            case 1:
                return "[waiting for connection]";
            case 2:
                return "[waiting for Initiator Hello]";
            case 3:
                return "[waiting for Responder Auth]";
            case 4:
                return "[waiting for Initiator Auth]";
            case 5:
                return "[waiting for Initiator Hello write to finish]";
            case 6:
                return "[waiting for Responder Auth write to finish]";
            default:
                return "[waiting for Initiator Auth write to finish]";
        }
    }

    /* renamed from: b */
    public final void mo13820b() {
        synchronized (this.f22683e) {
            f22679a.mo25414c("uWeave socket has disconnected from %s.", this.f22680b);
            if (!this.f22694p) {
                if (!this.f22697s && this.f22692n == 1) {
                    this.f22684f.mo14051g(1);
                    this.f22694p = true;
                }
            }
            mo13821b(0);
            this.f22693o.clear();
            this.f22695q.mo66713b();
        }
    }

    /* renamed from: c */
    public final int mo13822c() {
        return this.f22697s ? 1 : 2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        return r2;
     */
    /* renamed from: d */
    public final String mo13824d() {
        synchronized (this.f22683e) {
            jih jih = this.f22690l;
            String str = null;
            if (jih == null) {
                return null;
            }
            RemoteDevice a = jih.mo13757a();
            if (a != null) {
                str = a.f11138b;
            }
        }
    }

    /* renamed from: e */
    public final int mo13825e() {
        int i;
        synchronized (this.f22683e) {
            i = this.f22691m;
        }
        return i;
    }

    /* renamed from: f */
    public final byte[] mo13826f() {
        byte[] b;
        synchronized (this.f22683e) {
            jih jih = this.f22690l;
            b = jih != null ? jih.mo13760b() : null;
        }
        return b;
    }

    /* renamed from: g */
    public final void mo13827g() {
        synchronized (this.f22683e) {
            f22679a.mo25412b("disconnect() called.", new Object[0]);
            this.f22681c.mo66698a();
        }
    }

    /* renamed from: h */
    public final void mo13828h() {
        synchronized (this.f22683e) {
            this.f22692n = 0;
        }
    }

    /* renamed from: a */
    private final void m16822a(byte[] bArr, String str, Runnable runnable, int i) {
        synchronized (this.f22683e) {
            boolean z = true;
            if (runnable != null) {
                if (i == 0) {
                    z = false;
                }
                sdo.m34974b(z);
                mo13823c(i);
            } else {
                if (i != 0) {
                    z = false;
                }
                sdo.m34974b(z);
            }
            this.f22681c.mo66704b(bArr).mo66727a(new jkc(this, str, runnable, this.f22697s, this.f22684f.mo14040a("ble_weave_socket_write_time")));
        }
    }

    /* renamed from: c */
    public final void mo13823c(int i) {
        synchronized (this.f22683e) {
            this.f22692n = i;
            f22679a.mo25412b("Setting timer; waiting %s seconds for %s", 10L, m16821a(i));
            ((sny) this.f22682d).schedule(new jkd(this, i), 10, TimeUnit.SECONDS);
        }
    }

    /* renamed from: b */
    public final void mo13821b(int i) {
        synchronized (this.f22683e) {
            int i2 = this.f22691m;
            if (i2 != i) {
                f22679a.mo25414c("Connection status changed from %s to %s.", ConnectionInfo.m6759a(i2), ConnectionInfo.m6759a(i));
                this.f22691m = i;
                for (jns jns : this.f22698t) {
                    jns.mo13918b(this, i2, i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13814a() {
        synchronized (this.f22683e) {
            if (this.f22697s) {
                f22679a.mo25412b("onConnected() called, but the channel is in responder mode.", new Object[0]);
            } else if (this.f22691m != 0) {
                sdo.m34959a(this.f22689k);
                int i = this.f22691m;
                sdo.m34972a(i == 2, "Connected, but channel not authenticating, status=%d", Integer.valueOf(i));
                mo13828h();
                this.f22684f.mo14051g(0);
                this.f22684f.mo14044a(this.f22685g);
                this.f22687i = this.f22684f.mo14040a("central_role_write_initiator_hello_time");
                try {
                    jnz c = this.f22689k.mo13875c();
                    f22679a.mo25414c("Sending [Initiator Hello] message to address %s...", this.f22680b);
                    m16822a(c.mo13924a(), String.format(Locale.US, "Error while sending [Initiator Hello] to address %s; disconnecting.", this.f22680b), new jjy(this), 5);
                } catch (jmm e) {
                    f22679a.mo25417e("Error generating [Initiator Hello] message.", e, new Object[0]);
                    mo13827g();
                    this.f22699u.mo14033a(e);
                    this.f22684f.mo14049e(1);
                }
            } else {
                f22679a.mo25416d("Channel has been disconnected before socket connected.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo13815a(IOException iOException) {
        synchronized (this.f22683e) {
            f22679a.mo25415d("uWeave socket encountered an error communicating with %s.", iOException, this.f22680b);
            if (!this.f22694p) {
                if (!this.f22697s && this.f22692n == 1) {
                    this.f22684f.mo14051g(3);
                    this.f22694p = true;
                }
            }
            this.f22699u.mo14033a(iOException);
            mo13827g();
        }
    }

    /* renamed from: a */
    public final void mo13816a(jns jns) {
        synchronized (this.f22683e) {
            this.f22698t.add(jns);
        }
    }

    /* renamed from: a */
    public final void mo13817a(jnz jnz) {
        boolean z;
        boolean z2;
        synchronized (this.f22683e) {
            int i = this.f22691m;
            if (i == 0) {
                f22679a.mo25416d("Message was received after channel disconnected; message: 0x%s", srv.m36160a(jnz.f22915a));
                return;
            }
            boolean z3 = this.f22697s;
            if (z3) {
                if (i != 1) {
                    if (i != 2) {
                    }
                }
                mo13828h();
                synchronized (this.f22683e) {
                    if (this.f22688j != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sdo.m34970a(z2);
                    if (this.f22688j.f22884a.f167441a != byqw.NOT_STARTED) {
                        synchronized (this.f22683e) {
                            f22679a.mo25414c("Processing [Initiator Auth] message from %s.", this.f22680b);
                            try {
                                this.f22688j.mo13911c(jnz);
                                mo13821b(3);
                                this.f22684f.mo14050f(0);
                                this.f22684f.mo14044a(this.f22686h);
                            } catch (jmm e) {
                                f22679a.mo25417e("Error handling [Initiator Auth] message from %s.", e, this.f22680b);
                                mo13827g();
                                this.f22699u.mo14033a(e);
                                this.f22684f.mo14050f(2);
                            }
                        }
                    } else {
                        synchronized (this.f22683e) {
                            f22679a.mo25414c("Processing [Initiator Hello] message from %s.", this.f22680b);
                            try {
                                jnz b = this.f22688j.mo13910b(jnz);
                                if (this.f22688j.f22886c == null) {
                                    this.f22684f.mo14050f(6);
                                }
                                this.f22684f.mo14044a(this.f22686h);
                                this.f22686h = this.f22684f.mo14040a("peripheral_role_write_responder_auth_time");
                                f22679a.mo25414c("Sending [Responder Auth] to %s.", this.f22680b);
                                m16822a(b.mo13924a(), String.format(Locale.US, "Error while sending [Responder Auth] to address %s;  disconnecting.", this.f22680b), new jka(this), 6);
                            } catch (jmm e2) {
                                f22679a.mo25417e("Error handling [Initiator Hello] message from %s.", e2, this.f22680b);
                                mo13827g();
                                this.f22699u.mo14033a(e2);
                                this.f22684f.mo14050f(1);
                            }
                        }
                    }
                }
                return;
            }
            if (z3 || i != 2) {
                if (i != 3) {
                    f22679a.mo25418e("Unexpected message of length %d in state %s from address %s.", Integer.valueOf(jnz.f22915a.length), ConnectionInfo.m6759a(this.f22691m), this.f22680b);
                    return;
                }
                synchronized (this.f22683e) {
                    try {
                        byte[] a = this.f22690l.mo13759a(jnz);
                        for (jns jns : this.f22698t) {
                            jns.mo13919b(this, jnz.f22916b, a);
                        }
                    } catch (jmm e3) {
                        this.f22699u.mo14033a(e3);
                        f22679a.mo25417e("Unable to decrypt received message.", e3, new Object[0]);
                    }
                }
            } else if (this.f22689k.f22810a.f167430a != byqu.COMPLETE) {
                mo13828h();
                synchronized (this.f22683e) {
                    if (this.f22689k != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34970a(z);
                    f22679a.mo25414c("Processing [Responder Auth] message from %s.", this.f22680b);
                    this.f22684f.mo14044a(this.f22687i);
                    this.f22687i = this.f22684f.mo14040a("central_role_write_initiator_auth_time");
                    try {
                        jnz b2 = this.f22689k.mo13874b(jnz);
                        f22679a.mo25414c("Sending [Initiator Auth] to %s.", this.f22680b);
                        m16822a(b2.mo13924a(), String.format(Locale.US, "Error while sending [Initiator Auth] to address %s; disconnecting.", this.f22680b), new jjz(this), 7);
                    } catch (jmm e4) {
                        f22679a.mo25417e("Unable to decrypt [Responder Auth] from %s.", e4, this.f22680b);
                        mo13827g();
                        this.f22699u.mo14033a(e4);
                        this.f22684f.mo14049e(2);
                    }
                }
            } else {
                this.f22693o.add(jnz);
            }
        }
    }

    /* renamed from: a */
    public final void mo13818a(byte[] bArr) {
        try {
            DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
            int read = dataInputStream.read();
            if (read == -1) {
                throw new IOException("Unexpected EOF.");
            } else if (read == 3) {
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                if (readUnsignedShort != 0) {
                    int length = bArr.length;
                    int i = length - 3;
                    if (i == readUnsignedShort) {
                        mo13817a(jnz.m17006a(new JSONObject(new String(Arrays.copyOfRange(bArr, 3, length))), 1));
                        return;
                    }
                    throw new IOException(String.format(Locale.US, "Expected %d body bytes from address %s but received %d instead.", Integer.valueOf(readUnsignedShort), this.f22680b, Integer.valueOf(i)));
                }
                StringBuilder sb = new StringBuilder(38);
                sb.append("Invalid length of message: ");
                sb.append(0);
                throw new IOException(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder(54);
                sb2.append("Received message with unsupported version: ");
                sb2.append(read);
                throw new IOException(sb2.toString());
            }
        } catch (JSONException e) {
            throw new IOException("Error when parsing JSON message.", e);
        } catch (IOException e2) {
            f22679a.mo25413c("Unable to parse received message.", e2, new Object[0]);
            this.f22699u.mo14033a(e2);
        }
    }

    /* renamed from: a */
    public final void mo13819a(byte[] bArr, String str) {
        synchronized (this.f22683e) {
            if (!this.f22681c.mo66708c() || this.f22691m != 3) {
                throw new IllegalStateException("Must be connected and authenticated to send secure message.");
            }
            try {
                byte[] a = this.f22690l.mo13758a(bArr, str).mo13924a();
                String format = String.format(Locale.US, "Error while sending message 0x%s to address %s; disconnecting.", srv.m36160a(bArr), this.f22680b);
                synchronized (this.f22683e) {
                    m16822a(a, format, null, 0);
                }
            } catch (jmm e) {
                throw new IllegalStateException("Unable to encrypt", e);
            }
        }
    }
}
