package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: bnkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnkc extends bndl implements Serializable, bnkd {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public transient bnjz f131752a;

    /* renamed from: b */
    public transient bnjz f131753b;

    /* renamed from: c */
    public transient Map f131754c = bnel.m109128a(12);

    /* renamed from: d */
    public transient int f131755d;

    /* renamed from: e */
    public transient int f131756e;

    /* renamed from: a */
    public static bnkc m109632a() {
        return new bnkc();
    }

    /* renamed from: g */
    public static void m109633g(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131754c = new bnep(3);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            mo67268a(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f131755d);
        for (Map.Entry entry : mo67902b()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo67308a(Object obj, Iterable iterable) {
        throw null;
    }

    /* renamed from: b */
    public final List mo67902b() {
        return (List) super.mo67315n();
    }

    /* renamed from: c */
    public final int mo67269c() {
        return this.f131755d;
    }

    /* renamed from: d */
    public final void mo67270d() {
        this.f131752a = null;
        this.f131753b = null;
        this.f131754c.clear();
        this.f131755d = 0;
        this.f131756e++;
    }

    /* renamed from: e */
    public final Set mo67273e() {
        return new bnju(this);
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ Collection mo67277i() {
        return new bnjt(this);
    }

    /* renamed from: j */
    public final Iterator mo67278j() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: k */
    public final Map mo67279k() {
        return new bnnf(this);
    }

    /* renamed from: m */
    public final boolean mo67314m() {
        throw null;
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Collection mo67315n() {
        throw null;
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ Collection mo67317p() {
        throw null;
    }

    /* renamed from: a */
    public final bnjz mo67900a(Object obj, Object obj2, bnjz bnjz) {
        bnjz bnjz2 = new bnjz(obj, obj2);
        if (this.f131752a == null) {
            this.f131753b = bnjz2;
            this.f131752a = bnjz2;
            this.f131754c.put(obj, new bnjy(bnjz2));
            this.f131756e++;
        } else if (bnjz != null) {
            ((bnjy) this.f131754c.get(obj)).f131733c++;
            bnjz2.f131737d = bnjz.f131737d;
            bnjz2.f131739f = bnjz.f131739f;
            bnjz2.f131736c = bnjz;
            bnjz2.f131738e = bnjz;
            bnjz bnjz3 = bnjz.f131739f;
            if (bnjz3 == null) {
                ((bnjy) this.f131754c.get(obj)).f131731a = bnjz2;
            } else {
                bnjz3.f131738e = bnjz2;
            }
            bnjz bnjz4 = bnjz.f131737d;
            if (bnjz4 == null) {
                this.f131752a = bnjz2;
            } else {
                bnjz4.f131736c = bnjz2;
            }
            bnjz.f131737d = bnjz2;
            bnjz.f131739f = bnjz2;
        } else {
            bnjz bnjz5 = this.f131753b;
            bnjz5.f131736c = bnjz2;
            bnjz2.f131737d = bnjz5;
            this.f131753b = bnjz2;
            bnjy bnjy = (bnjy) this.f131754c.get(obj);
            if (bnjy == null) {
                this.f131754c.put(obj, new bnjy(bnjz2));
                this.f131756e++;
            } else {
                bnjy.f131733c++;
                bnjz bnjz6 = bnjy.f131732b;
                bnjz6.f131738e = bnjz2;
                bnjz2.f131739f = bnjz6;
                bnjy.f131732b = bnjz2;
            }
        }
        this.f131755d++;
        return bnjz2;
    }

    /* renamed from: b */
    public final List mo67126b(Object obj) {
        List unmodifiableList = Collections.unmodifiableList(bnkn.m109664a(new bnkb(this, obj)));
        mo67903e(obj);
        return unmodifiableList;
    }

    /* renamed from: d */
    public final boolean mo67271d(Object obj) {
        return this.f131754c.containsKey(obj);
    }

    /* renamed from: e */
    public final void mo67903e(Object obj) {
        bnjr.m109625g(new bnkb(this, obj));
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Collection mo67275g() {
        return new bnjw(this);
    }

    /* renamed from: a */
    public final List mo67127c(Object obj) {
        return new bnjs(this, obj);
    }

    /* renamed from: a */
    public final void mo67901a(bnjz bnjz) {
        bnjz bnjz2 = bnjz.f131737d;
        if (bnjz2 != null) {
            bnjz2.f131736c = bnjz.f131736c;
        } else {
            this.f131752a = bnjz.f131736c;
        }
        bnjz bnjz3 = bnjz.f131736c;
        if (bnjz3 != null) {
            bnjz3.f131737d = bnjz2;
        } else {
            this.f131753b = bnjz2;
        }
        if (bnjz.f131739f == null && bnjz.f131738e == null) {
            ((bnjy) this.f131754c.remove(bnjz.f131734a)).f131733c = 0;
            this.f131756e++;
        } else {
            bnjy bnjy = (bnjy) this.f131754c.get(bnjz.f131734a);
            bnjy.f131733c--;
            bnjz bnjz4 = bnjz.f131739f;
            if (bnjz4 == null) {
                bnjy.f131731a = bnjz.f131738e;
            } else {
                bnjz4.f131738e = bnjz.f131738e;
            }
            bnjz bnjz5 = bnjz.f131738e;
            if (bnjz5 == null) {
                bnjy.f131732b = bnjz4;
            } else {
                bnjz5.f131739f = bnjz4;
            }
        }
        this.f131755d--;
    }

    /* renamed from: a */
    public final boolean mo67268a(Object obj, Object obj2) {
        mo67900a(obj, obj2, null);
        return true;
    }
}
