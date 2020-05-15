package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.Set;

/* renamed from: bnig */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bnig extends bnht implements bnot {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final transient bnic f131659a = m109512a((Comparator) null);

    /* renamed from: d */
    private transient bnic f131660d;

    public bnig(bnhe bnhe, int i) {
        super(bnhe, i);
    }

    /* renamed from: a */
    private static bnic m109512a(Comparator comparator) {
        if (comparator == null) {
            return bnon.f131923a;
        }
        return bniq.m109554a(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            bnha h = bnhe.m109414h();
            int i = 0;
            int i2 = 0;
            while (i < readInt) {
                Object readObject = objectInputStream.readObject();
                int readInt2 = objectInputStream.readInt();
                if (readInt2 > 0) {
                    bnia bnio = comparator != null ? new bnio(comparator) : new bnia();
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        bnio.mo67629b(objectInputStream.readObject());
                    }
                    bnic a = bnio.mo67751a();
                    if (a.size() == readInt2) {
                        h.mo67695b(readObject, a);
                        i2 += readInt2;
                        i++;
                    } else {
                        String valueOf = String.valueOf(readObject);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                        sb.append("Duplicate key-value pairs exist for key ");
                        sb.append(valueOf);
                        throw new InvalidObjectException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(31);
                    sb2.append("Invalid value count ");
                    sb2.append(readInt2);
                    throw new InvalidObjectException(sb2.toString());
                }
            }
            try {
                bnhr.f131639a.mo68207a(this, h.mo67618b());
                bnhr.f131640b.mo68206a(this, i2);
                bnif.f131658a.mo68207a(this, m109512a(comparator));
            } catch (IllegalArgumentException e) {
                throw ((InvalidObjectException) new InvalidObjectException(e.getMessage()).initCause(e));
            }
        } else {
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Invalid key count ");
            sb3.append(readInt);
            throw new InvalidObjectException(sb3.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Comparator comparator;
        objectOutputStream.defaultWriteObject();
        bnic bnic = this.f131659a;
        if (bnic instanceof bniq) {
            comparator = ((bniq) bnic).f131676a;
        } else {
            comparator = null;
        }
        objectOutputStream.writeObject(comparator);
        bnos.m110025a(this, objectOutputStream);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Set mo67361a(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Set mo67362b(Object obj) {
        throw null;
    }

    @Deprecated
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo67363b(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: e */
    public final bnic mo67692g(Object obj) {
        return (bnic) bmxu.m108565a((bnic) ((bnht) this).f131642b.get(obj), this.f131659a);
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ Set mo67364r() {
        throw null;
    }

    /* renamed from: u */
    public final bnic mo67315n() {
        bnic bnic = this.f131660d;
        if (bnic != null) {
            return bnic;
        }
        bnie bnie = new bnie(this);
        this.f131660d = bnie;
        return bnie;
    }

    /* renamed from: a */
    public static bnid m109513a() {
        return new bnid();
    }
}
