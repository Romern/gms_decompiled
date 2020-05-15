package p000;

import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: bpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpl extends LinkedHashMap implements Map, Serializable, Iterable {
    /* renamed from: a */
    public static bpc m3441a(bpc bpc, bpo bpo) {
        Iterator it = bpc.iterator();
        bpc bpc2 = null;
        while (it.hasNext() && bpc2 == null) {
            bpc bpc3 = (bpc) it.next();
            if (bpc3.mo3349a().equals(bpo)) {
                bpc2 = bpc3;
            } else if (bpc3.mo3349a().mo3378b()) {
                bpc2 = m3441a(bpc3, bpo);
            }
        }
        return bpc2;
    }

    /* renamed from: b */
    public final bpc mo3369b(bpo bpo) {
        return (bpc) get(bpo);
    }

    public final Iterator iterator() {
        return Collections.unmodifiableCollection(values()).iterator();
    }

    public final String toString() {
        return bpp.m3462a(mo3368a());
    }

    /* renamed from: a */
    public final bpc mo3366a(bpo bpo) {
        bpc b = mo3369b(bpo);
        if (b == null) {
            for (bpc bpc : values()) {
                if (bpc.mo3349a().mo3378b()) {
                    b = m3441a(bpc, bpo);
                    continue;
                }
                if (b != null) {
                    break;
                }
            }
        }
        return b;
    }

    /* renamed from: a */
    public final void mo3367a(bpc bpc) {
        if (bpc != null) {
            put(bpc.mo3349a(), bpc);
            return;
        }
        throw new IllegalArgumentException("The provided TLV is null");
    }

    /* renamed from: a */
    public final byte[] mo3368a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Iterator it = iterator();
        while (it.hasNext()) {
            ((bpc) it.next()).mo3352a(byteArrayOutputStream);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
