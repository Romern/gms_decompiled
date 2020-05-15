package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* renamed from: bnos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnos {
    /* renamed from: a */
    static bnor m110023a(Class cls, String str) {
        try {
            return new bnor(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    static void m110024a(bnmu bnmu, ObjectInputStream objectInputStream, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Collection c = bnmu.mo67127c(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i3 = 0; i3 < readInt; i3++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    /* renamed from: a */
    static void m110025a(bnmu bnmu, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(bnmu.mo67318q().size());
        for (Map.Entry entry : bnmu.mo67318q().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object obj : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(obj);
            }
        }
    }
}
