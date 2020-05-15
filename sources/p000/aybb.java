package p000;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: aybb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aybb {

    /* renamed from: a */
    static final qxh f97007a = axty.f96348a.mo53544a("connection-digest-mismatch");

    /* renamed from: a */
    public static int m83723a(axyb axyb, ayax ayax, OutputStream outputStream, ayew ayew, ayas ayas, axya axya, axua axua, int i) {
        int i2;
        byte[] bArr;
        axyb axyb2 = axyb;
        ayax ayax2 = ayax;
        OutputStream outputStream2 = outputStream;
        ayew ayew2 = ayew;
        ayas ayas2 = ayas;
        axya axya2 = axya;
        axua axua2 = axua;
        ayas2.mo53844a(true);
        if (axua2 != null) {
            bArr = axua2.f96358d.mo74476a(ayew.mo73642k());
            i2 = bArr.length;
        } else {
            i2 = ayew2.f164961ai;
            if (i2 == -1) {
                i2 = bxxm.f165037a.mo74228a(ayew2).mo74223b(ayew2);
                ayew2.f164961ai = i2;
            }
            m83730a(ayax2, i2);
            ayew2.mo73644a(bxuk.m123644c(ayax2.f97000b, 0, i2));
            bArr = ayax2.f97000b;
        }
        if (Log.isLoggable("wearable", 2) || Log.isLoggable("WearableVerbose", 2)) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("sending message of length ");
            sb.append(i2);
            Log.v("wearable", sb.toString());
        }
        int i3 = i2 + 4;
        if (i >= 3 && chnj.f188812a.mo6606a().mo85407af()) {
            ayax2.f96999a.clear();
            ByteBuffer byteBuffer = ayax2.f96999a;
            int length = bArr.length;
            byteBuffer.putInt(length);
            ayax2.f96999a.flip();
            byte[] array = ayax2.f96999a.array();
            int length2 = array.length;
            int i4 = length2 + length;
            byte[] copyOf = Arrays.copyOf(array, i4);
            System.arraycopy(bArr, 0, copyOf, length2, length);
            outputStream2.write(copyOf, 0, i4);
        } else {
            Integer valueOf = Integer.valueOf(i2);
            ayax2.f96999a.clear();
            ayax2.f96999a.putInt(valueOf.intValue());
            ayax2.f96999a.flip();
            outputStream2.write(ayax2.f96999a.array(), ayax2.f96999a.position() + ayax2.f96999a.arrayOffset(), ayax2.f96999a.limit());
            outputStream2.write(bArr, 0, i2);
        }
        ayas2.mo53844a(false);
        ayas2.mo53841a(i3);
        axyb2.mo53756a(axya2, "bytesSent", i3);
        axyb2.mo53756a(axya2, "msgsSent", 1);
        if (Log.isLoggable("wearable", 2) || Log.isLoggable("WearableVerbose", 2)) {
            StringBuilder sb2 = new StringBuilder(45);
            sb2.append("sending message of length ");
            sb2.append(i2);
            sb2.append(" is done");
            Log.v("wearable", sb2.toString());
        }
        return i3;
    }

    /* renamed from: b */
    public static ayew m83734b(ayev ayev) {
        byte[] k = ayev.mo73642k();
        bxvd da = ayew.f97392g.mo74144da();
        bxtx a = bxtx.m123261a(k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayew ayew = (ayew) da.f164949b;
        a.getClass();
        ayew.f97394a |= 1;
        ayew.f97395b = a;
        String a2 = axxv.m83495a(k);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ayew ayew2 = (ayew) da.f164949b;
        a2.getClass();
        int i = ayew2.f97394a | 2;
        ayew2.f97394a = i;
        ayew2.f97396c = a2;
        int i2 = i | 4;
        ayew2.f97394a = i2;
        ayew2.f97397d = 1;
        ayew2.f97394a = i2 | 8;
        ayew2.f97398e = 1;
        return (ayew) da.mo74062i();
    }

    /* renamed from: b */
    public static String m83735b(ayew ayew) {
        return String.format(Locale.US, "MessagePiece: queueId=%d digest=%s len=%d piece=%d of %d", Integer.valueOf(ayew.f97399f), ayew.f97396c, Integer.valueOf(ayew.f97395b.mo73744a()), Integer.valueOf(ayew.f97397d), Integer.valueOf(ayew.f97398e));
    }

    /* renamed from: a */
    public static int m83724a(ayax ayax, InputStream inputStream, bxvd bxvd, ayas ayas, axua axua) {
        int i;
        byte[] bArr;
        ayas.mo53847b(false);
        ayax.f96999a.clear();
        m83733a(inputStream, ayax.f96999a.array(), 4);
        ayax.f96999a.position(4);
        ayax.f96999a.flip();
        int i2 = ayax.f96999a.getInt();
        if (axua == null) {
            m83730a(ayax, i2);
            m83733a(inputStream, ayax.f97000b, i2);
            bArr = ayax.f97000b;
            i = i2;
        } else {
            byte[] bArr2 = new byte[i2];
            m83733a(inputStream, bArr2, i2);
            bArr = axua.mo53552a(bArr2);
            i = bArr.length;
        }
        bxvd.mo74019a(bArr, 0, i, bxus.m123744c());
        int i3 = i2 + 4;
        ayas.mo53847b(true);
        ayas.mo53846b(i3);
        return i3;
    }

    /* renamed from: a */
    public static axya m83725a(ayev ayev) {
        int i = ayev.f97378a;
        String str = "unknown";
        String str2 = null;
        if ((i & 1) != 0) {
            ayfb ayfb = ayev.f97379b;
            if (ayfb == null) {
                ayfb = ayfb.f97441e;
            }
            if ((ayfb.f97443a & 2) != 0) {
                ayfb ayfb2 = ayev.f97379b;
                if (ayfb2 == null) {
                    ayfb2 = ayfb.f97441e;
                }
                ayeb ayeb = ayfb2.f97445c;
                if (ayeb == null) {
                    ayeb = ayeb.f97275b;
                }
                if (ayeb.f97277a.size() > 0) {
                    ayfb ayfb3 = ayev.f97379b;
                    if (ayfb3 == null) {
                        ayfb3 = ayfb.f97441e;
                    }
                    ayeb ayeb2 = ayfb3.f97445c;
                    if (ayeb2 == null) {
                        ayeb2 = ayeb.f97275b;
                    }
                    str = ((ayec) ayeb2.f97277a.get(0)).f97282b;
                }
                ayfb ayfb4 = ayev.f97379b;
                if (ayfb4 == null) {
                    ayfb4 = ayfb.f97441e;
                }
                ayeb ayeb3 = ayfb4.f97445c;
                if (ayeb3 == null) {
                    ayeb3 = ayeb.f97275b;
                }
                if (ayeb3.f97277a.size() > 1) {
                    str = String.valueOf(str).concat("(shared)");
                }
            }
        } else if ((i & 4) != 0) {
            ayes ayes = ayev.f97381d;
            if (ayes == null) {
                ayes = ayes.f97358f;
            }
            String str3 = ayes.f97361b;
            if (!bmxx.m108577a(str3)) {
                str = str3;
            }
        } else if ((i & 64) != 0) {
            ayfc ayfc = ayev.f97385h;
            if (ayfc == null) {
                ayfc = ayfc.f97448k;
            }
            str = ayfc.f97451b;
        } else if ((i & 128) != 0) {
            ayfa ayfa = ayev.f97386i;
            if (ayfa == null) {
                ayfa = ayfa.f97427k;
            }
            str = ayfa.f97431c;
        } else if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            ayfa ayfa2 = ayev.f97387j;
            if (ayfa2 == null) {
                ayfa2 = ayfa.f97427k;
            }
            str = ayfa2.f97431c;
        } else {
            str = null;
        }
        ayex a = ayey.m83900a(ayev);
        if ((ayev.f97378a & 128) != 0) {
            ayfa ayfa3 = ayev.f97386i;
            if (ayfa3 == null) {
                ayfa3 = ayfa.f97427k;
            }
            if ("com.google.android.wearable.app".equals(ayfa3.f97431c)) {
                ayfa ayfa4 = ayev.f97386i;
                if (ayfa4 == null) {
                    ayfa4 = ayfa.f97427k;
                }
                str2 = ayfa4.f97434f;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "(no path)";
                }
            }
        }
        return new axya(a, str, str2);
    }

    /* renamed from: a */
    public static ayax m83726a() {
        return new ayax();
    }

    /* renamed from: a */
    public static ayev m83727a(ayew ayew) {
        bxvd da = ayev.f97376n.mo74144da();
        da.mo73631a(ayew.f97395b.mo73780k(), 0, ayew.f97395b.mo73744a());
        ayev ayev = (ayev) da.mo74062i();
        String a = axxv.m83495a(ayew.f97395b.mo73780k());
        if (ayew.f97396c.equals(a)) {
            return ayev;
        }
        f97007a.mo24359a();
        String str = ayew.f97396c;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 64 + String.valueOf(str).length());
        sb.append("The computed message digest should match the received digest: ");
        sb.append(a);
        sb.append(", ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public static ayev m83728a(List list) {
        String str = ((ayew) list.get(0)).f97396c;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ayew) it.next()).f97395b.mo73744a();
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            allocate.put(((ayew) list.get(i2)).f97395b.mo73780k());
        }
        String a = axxv.m83495a(allocate.array());
        if (str.equals(a)) {
            return (ayev) ((bxvd) ayev.f97376n.mo74144da().mo73633b(allocate.array())).mo74062i();
        }
        f97007a.mo24359a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 64 + String.valueOf(str).length());
        sb.append("The computed message digest should match the received digest: ");
        sb.append(a);
        sb.append(", ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    /* renamed from: a */
    public static List m83729a(ayev ayev, int i, int i2) {
        byte[] k = ayev.mo73642k();
        String a = axxv.m83495a(k);
        int length = ((k.length + i) - 1) / i;
        ArrayList arrayList = new ArrayList(length);
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 * i;
            int min = Math.min(k.length - i4, i);
            bxvd da = ayew.f97392g.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayew ayew = (ayew) da.f164949b;
            int i5 = ayew.f97394a | 16;
            ayew.f97394a = i5;
            ayew.f97399f = i2;
            i3++;
            int i6 = i5 | 4;
            ayew.f97394a = i6;
            ayew.f97397d = i3;
            a.getClass();
            ayew.f97394a = i6 | 2;
            ayew.f97396c = a;
            bxtx a2 = bxtx.m123262a(k, i4, min);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ayew ayew2 = (ayew) da.f164949b;
            a2.getClass();
            int i7 = ayew2.f97394a | 1;
            ayew2.f97394a = i7;
            ayew2.f97395b = a2;
            ayew2.f97394a = i7 | 8;
            ayew2.f97398e = length;
            arrayList.add((ayew) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m83730a(ayax ayax, int i) {
        byte[] bArr = ayax.f97000b;
        if (bArr == null || i > bArr.length) {
            int round = Math.round(((float) i) * 1.1f);
            byte[] bArr2 = ayax.f97000b;
            if (bArr2 != null) {
                int length = bArr2.length;
                StringBuilder sb = new StringBuilder(71);
                sb.append("ensureBuffersHaveSpace: increasing size from ");
                sb.append(length);
                sb.append(" to ");
                sb.append(round);
                Log.v("wearable", sb.toString());
            }
            ayax.f97000b = new byte[round];
        }
    }

    /* renamed from: a */
    public static void m83731a(ayay ayay, ayew ayew, axya axya, axua axua) {
        m83723a(ayay.f97004d, ayay.f97003c, ayay.f97002b, ayew, ayay.f97005e, axya, axua, -1);
    }

    /* renamed from: a */
    public static void m83732a(ayay ayay, bxvd bxvd, axua axua) {
        m83724a(ayay.f97003c, ayay.f97001a, bxvd, ayay.f97005e, axua);
    }

    /* renamed from: a */
    private static void m83733a(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read > 0) {
                i2 += read;
            } else {
                throw new IOException("connection closed");
            }
        }
        if (Log.isLoggable("wearable", 2) || Log.isLoggable("WearableVerbose", 2)) {
            StringBuilder sb = new StringBuilder(46);
            sb.append("reading message of length ");
            sb.append(i);
            sb.append(" is done.");
            Log.v("wearable", sb.toString());
        }
    }
}
