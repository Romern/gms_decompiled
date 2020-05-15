package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: bndh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bndh extends bndm implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    transient bnnx f131485a;

    /* renamed from: b */
    transient long f131486b;

    public bndh(int i) {
        mo67288a(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        mo67288a(3);
        for (int i = 0; i < readInt; i++) {
            mo67290b(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(mo67324e().size());
        for (bnno bnno : mo67324e()) {
            objectOutputStream.writeObject(bnno.f131866a);
            objectOutputStream.writeInt(bnno.mo68118a());
        }
    }

    /* renamed from: a */
    public final int mo67285a(Object obj) {
        return this.f131485a.mo68151b(obj);
    }

    /* renamed from: a */
    public abstract void mo67288a(int i);

    /* renamed from: b */
    public final Iterator mo67289b() {
        return new bndf(this);
    }

    /* renamed from: c */
    public final int mo67291c() {
        return this.f131485a.f131884c;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(long[], long):void}
     arg types: [long[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(long[], long):void} */
    public final void clear() {
        bnnx bnnx = this.f131485a;
        bnnx.f131885d++;
        Arrays.fill(bnnx.f131882a, 0, bnnx.f131884c, (Object) null);
        Arrays.fill(bnnx.f131883b, 0, bnnx.f131884c, 0);
        Arrays.fill(bnnx.f131886e, -1);
        Arrays.fill(bnnx.f131887f, -1L);
        bnnx.f131884c = 0;
        this.f131486b = 0;
    }

    public final Iterator iterator() {
        return new bnnr(this, mo67324e().iterator());
    }

    public final int size() {
        return bqcn.m112585b(this.f131486b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bmxy.a(boolean, java.lang.String, int):void
     arg types: [int, java.lang.String, int]
     candidates:
      bmxy.a(int, int, java.lang.String):java.lang.String
      bmxy.a(int, int, int):void
      bmxy.a(java.lang.Object, java.lang.String, int):void
      bmxy.a(java.lang.Object, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, char):void
      bmxy.a(boolean, java.lang.String, long):void
      bmxy.a(boolean, java.lang.String, java.lang.Object):void
      bmxy.a(boolean, java.lang.String, int):void */
    /* renamed from: a */
    public final int mo67286a(Object obj, int i) {
        bmxy.m108591a(true, "occurrences cannot be negative: %s", i);
        int a = this.f131485a.mo68148a(obj);
        if (a == -1) {
            return 0;
        }
        int c = this.f131485a.mo68153c(a);
        if (c > i) {
            this.f131485a.mo68149a(a, c - i);
        } else {
            this.f131485a.mo68156f(a);
            i = c;
        }
        this.f131486b -= (long) i;
        return c;
    }

    /* renamed from: b */
    public final void mo67290b(Object obj, int i) {
        boolean z;
        if (i == 0) {
            mo67285a(obj);
            return;
        }
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108591a(z, "occurrences cannot be negative: %s", i);
        int a = this.f131485a.mo68148a(obj);
        if (a == -1) {
            this.f131485a.mo68150a(obj, i);
            this.f131486b += (long) i;
            return;
        }
        long j = (long) i;
        long c = ((long) this.f131485a.mo68153c(a)) + j;
        if (c > 2147483647L) {
            z2 = false;
        }
        bmxy.m108593a(z2, "too many occurrences: %s", c);
        this.f131485a.mo68149a(a, (int) c);
        this.f131486b += j;
    }

    /* renamed from: c */
    public final boolean mo67292c(Object obj, int i) {
        bndz.m109113a(i, "oldCount");
        bndz.m109113a(0, "newCount");
        int a = this.f131485a.mo68148a(obj);
        if (a == -1) {
            return i == 0;
        }
        if (this.f131485a.mo68153c(a) != i) {
            return false;
        }
        this.f131485a.mo68156f(a);
        this.f131486b -= (long) i;
        return true;
    }

    /* renamed from: a */
    public final Iterator mo67287a() {
        return new bnde(this);
    }
}
