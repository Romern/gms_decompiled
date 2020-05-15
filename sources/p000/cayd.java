package p000;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: cayd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cayd {

    /* renamed from: a */
    public final catk f176378a;

    /* renamed from: b */
    public final cavi f176379b;

    /* renamed from: c */
    private Proxy f176380c;

    /* renamed from: d */
    private InetSocketAddress f176381d;

    /* renamed from: e */
    private List f176382e = Collections.emptyList();

    /* renamed from: f */
    private int f176383f;

    /* renamed from: g */
    private List f176384g = Collections.emptyList();

    /* renamed from: h */
    private int f176385h;

    /* renamed from: i */
    private final List f176386i = new ArrayList();

    public cayd(catk catk, cavi cavi) {
        this.f176378a = catk;
        this.f176379b = cavi;
        caue caue = catk.f175826a;
        Proxy proxy = catk.f175832g;
        if (proxy != null) {
            this.f176382e = Collections.singletonList(proxy);
        } else {
            this.f176382e = new ArrayList();
            List<Proxy> select = this.f176378a.f175831f.select(caue.mo74886b());
            if (select != null) {
                this.f176382e.addAll(select);
            }
            this.f176382e.removeAll(Collections.singleton(Proxy.NO_PROXY));
            this.f176382e.add(Proxy.NO_PROXY);
        }
        this.f176383f = 0;
    }

    /* renamed from: c */
    private final boolean m127528c() {
        return this.f176383f < this.f176382e.size();
    }

    /* renamed from: d */
    private final boolean m127529d() {
        return this.f176385h < this.f176384g.size();
    }

    /* renamed from: e */
    private final boolean m127530e() {
        return !this.f176386i.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo75068a() {
        return m127529d() || m127528c() || m127530e();
    }

    /* renamed from: b */
    public final caup mo75069b() {
        String str;
        int i;
        if (!m127529d()) {
            if (!m127528c()) {
                if (m127530e()) {
                    return (caup) this.f176386i.remove(0);
                }
                throw new NoSuchElementException();
            } else if (m127528c()) {
                List list = this.f176382e;
                int i2 = this.f176383f;
                this.f176383f = i2 + 1;
                Proxy proxy = (Proxy) list.get(i2);
                this.f176384g = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    str = this.f176378a.mo74845a();
                    i = this.f176378a.mo74846b();
                } else {
                    SocketAddress address = proxy.address();
                    if (address instanceof InetSocketAddress) {
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                        InetAddress address2 = inetSocketAddress.getAddress();
                        if (address2 == null) {
                            str = inetSocketAddress.getHostName();
                        } else {
                            str = address2.getHostAddress();
                        }
                        i = inetSocketAddress.getPort();
                    } else {
                        String valueOf = String.valueOf(address.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
                        sb.append("Proxy.address() is not an InetSocketAddress: ");
                        sb.append(valueOf);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (i <= 0 || i > 65535) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 46);
                    sb2.append("No route to ");
                    sb2.append(str);
                    sb2.append(":");
                    sb2.append(i);
                    sb2.append("; port is out of range");
                    throw new SocketException(sb2.toString());
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    this.f176384g.add(InetSocketAddress.createUnresolved(str, i));
                } else {
                    List a = this.f176378a.f175827b.mo57846a(str);
                    int size = a.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        this.f176384g.add(new InetSocketAddress((InetAddress) a.get(i3), i));
                    }
                }
                this.f176385h = 0;
                this.f176380c = proxy;
            } else {
                String a2 = this.f176378a.mo74845a();
                String valueOf2 = String.valueOf(this.f176382e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(a2).length() + 46 + String.valueOf(valueOf2).length());
                sb3.append("No route to ");
                sb3.append(a2);
                sb3.append("; exhausted proxy configurations: ");
                sb3.append(valueOf2);
                throw new SocketException(sb3.toString());
            }
        }
        if (m127529d()) {
            List list2 = this.f176384g;
            int i4 = this.f176385h;
            this.f176385h = i4 + 1;
            this.f176381d = (InetSocketAddress) list2.get(i4);
            caup caup = new caup(this.f176378a, this.f176380c, this.f176381d);
            if (!this.f176379b.mo74962c(caup)) {
                return caup;
            }
            this.f176386i.add(caup);
            return mo75069b();
        }
        String a3 = this.f176378a.mo74845a();
        String valueOf3 = String.valueOf(this.f176384g);
        StringBuilder sb4 = new StringBuilder(String.valueOf(a3).length() + 47 + String.valueOf(valueOf3).length());
        sb4.append("No route to ");
        sb4.append(a3);
        sb4.append("; exhausted inet socket addresses: ");
        sb4.append(valueOf3);
        throw new SocketException(sb4.toString());
    }
}
