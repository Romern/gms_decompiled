package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* renamed from: bnld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnld extends bnkq {
    private static final long serialVersionUID = 3;

    public bnld(bnle bnle, bnle bnle2, bmxh bmxh, int i, ConcurrentMap concurrentMap) {
        super(bnle, bnle2, bmxh, i, concurrentMap);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        bnko bnko = new bnko();
        int i = bnko.f131770b;
        boolean z5 = false;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108602b(z, "initial capacity was already set to %s", i);
        if (readInt >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108588a(z2);
        bnko.f131770b = readInt;
        bnko.mo67938a(this.f131775a);
        bnko.mo67940b(this.f131776b);
        bmxh bmxh = this.f131777c;
        bmxh bmxh2 = bnko.f131774f;
        if (bmxh2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        bmxy.m108605b(z3, "key equivalence was already set to %s", bmxh2);
        bmxy.m108581a(bmxh);
        bnko.f131774f = bmxh;
        bnko.f131769a = true;
        int i2 = this.f131778d;
        int i3 = bnko.f131771c;
        if (i3 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        bmxy.m108602b(z4, "concurrency level was already set to %s", i3);
        if (i2 > 0) {
            z5 = true;
        }
        bmxy.m108588a(z5);
        bnko.f131771c = i2;
        this.f131779e = bnko.mo67943e();
        while (true) {
            Object readObject = objectInputStream.readObject();
            if (readObject != null) {
                this.f131779e.put(readObject, objectInputStream.readObject());
            } else {
                return;
            }
        }
    }

    private Object readResolve() {
        return this.f131779e;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f131779e.size());
        for (Map.Entry entry : this.f131779e.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
        objectOutputStream.writeObject(null);
    }
}
