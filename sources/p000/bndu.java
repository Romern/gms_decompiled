package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: bndu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bndu extends bnci {
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    transient int f131498c;

    private bndu() {
        this(12, 3);
    }

    /* renamed from: a */
    public static bndu m109108a(int i, int i2) {
        return new bndu(i, i2);
    }

    /* renamed from: r */
    public static bndu m109109r() {
        return new bndu(12, 3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f131498c = 3;
        int readInt = objectInputStream.readInt();
        mo67267a((Map) bnel.m109127a());
        bnos.m110024a(this, objectInputStream, readInt);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        bnos.m110025a(this, objectOutputStream);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Collection mo67121a() {
        return new ArrayList(this.f131498c);
    }

    private bndu(int i, int i2) {
        super(bnel.m109128a(i));
        bndz.m109113a(i2, "expectedValuesPerKey");
        this.f131498c = i2;
    }
}
