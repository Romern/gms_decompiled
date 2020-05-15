package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bnng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnng extends bnci {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    transient bmzi f131860c;

    public bnng(Map map, bmzi bmzi) {
        super(map);
        bmxy.m108581a(bmzi);
        this.f131860c = bmzi;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131860c = (bmzi) objectInputStream.readObject();
        mo67267a((Map) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f131860c);
        objectOutputStream.writeObject(((bndd) this).f131477a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo67121a() {
        return (List) this.f131860c.mo6606a();
    }

    /* renamed from: e */
    public final Set mo67273e() {
        return mo67274f();
    }

    /* renamed from: k */
    public final Map mo67279k() {
        return mo67280l();
    }
}
