package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: bnge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bnge extends bndq {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    transient int f131594c;

    private bnge() {
        this(12, 2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131594c = 2;
        int readInt = objectInputStream.readInt();
        mo67267a((Map) bnel.m109128a(12));
        bnos.m110024a(this, objectInputStream, readInt);
    }

    /* renamed from: s */
    public static bnge m109299s() {
        return new bnge(12, 2);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        bnos.m110025a(this, objectOutputStream);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo67121a() {
        return bnen.m109150a(this.f131594c);
    }

    public bnge(int i, int i2) {
        super(bnel.m109128a(i));
        this.f131594c = 2;
        bmxy.m108588a(true);
        this.f131594c = i2;
    }
}
