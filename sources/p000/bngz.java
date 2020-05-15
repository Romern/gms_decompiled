package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bngz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bngz extends bnht implements bnkd {
    private static final long serialVersionUID = 0;

    public bngz(bnhe bnhe, int i) {
        super(bnhe, i);
    }

    /* renamed from: a */
    public static bngy m109387a() {
        return new bngy();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            bnha h = bnhe.m109414h();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    bngs j = bngx.m109377j();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        j.mo67668c(objectInputStream.readObject());
                    }
                    h.mo67695b(readObject, j.mo67664a());
                    i2 += readInt2;
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Invalid value count ");
                    sb.append(readInt2);
                    throw new InvalidObjectException(sb.toString());
                }
            }
            try {
                bnhr.f131639a.mo68207a(this, h.mo67618b());
                bnhr.f131640b.mo68206a(this, i2);
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Invalid key count ");
            sb2.append(readInt);
            throw new InvalidObjectException(sb2.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        bnos.m110025a(this, objectOutputStream);
    }

    @Deprecated
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ List mo67126b(Object obj) {
        throw null;
    }

    /* renamed from: e */
    public final bngx mo67692g(Object obj) {
        bngx bngx = (bngx) ((bnht) this).f131642b.get(obj);
        return bngx == null ? bngx.m109376e() : bngx;
    }

    /* renamed from: a */
    public static bngz m109388a(Collection collection) {
        if (collection.isEmpty()) {
            return bnfb.f131552a;
        }
        bnha bnha = new bnha(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            bngx a = bngx.m109368a((Collection) entry.getValue());
            if (!a.isEmpty()) {
                bnha.mo67695b(key, a);
                i += a.size();
            }
        }
        return new bngz(bnha.mo67618b(), i);
    }
}
