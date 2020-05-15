package p000;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: GeneratedMessageLite */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class GeneratedMessageLite extends bxsz {

    /* renamed from: aj */
    public static final Map f164959aj = new ConcurrentHashMap();

    /* renamed from: ah */
    protected bxyo f164960ah = bxyo.f165102a;

    /* renamed from: ai */
    public int f164961ai = -1;

    /* renamed from: a */
    public static bxvj m124006a(bxxc bxxc, Object obj, bxxc bxxc2, int i, bxzf bxzf) {
        return new bxvj(bxxc, obj, bxxc2, new bxvi(i, bxzf));
    }

    /* renamed from: b */
    public static bxvj m124025b(bxuq bxuq) {
        return (bxvj) bxuq;
    }

    /* renamed from: dc */
    public static bxvt m124028dc() {
        return bxvm.f164965b;
    }

    /* renamed from: dd */
    public static bxvw m124029dd() {
        return bxwq.f165002b;
    }

    /* renamed from: de */
    public static bxwc m124030de() {
        return bxxn.f165040b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo3216a(int i, Object obj);

    /* renamed from: aS */
    public final boolean mo74020aS() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo74142c(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e = bxxm.f165037a.mo74228a(this).mo74226e(this);
        if (!booleanValue) {
            return e;
        }
        mo3216a(2, !e ? null : this);
        return e;
    }

    /* renamed from: b */
    public final void mo73640b(int i) {
        this.f164961ai = i;
    }

    /* renamed from: c */
    public final Object mo74142c(int i) {
        return mo3216a(i, (Object) null);
    }

    /* renamed from: cZ */
    public final bxxk mo74143cZ() {
        return (bxxk) mo74142c(7);
    }

    /* renamed from: da */
    public final bxvd mo74144da() {
        return (bxvd) mo74142c(5);
    }

    /* renamed from: db */
    public final int mo74145db() {
        int i = this.f164961ai;
        if (i != -1) {
            return i;
        }
        int b = bxxm.f165037a.mo74228a(this).mo74223b(this);
        this.f164961ai = b;
        return b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return bxxm.f165037a.mo74228a(this).mo74222a(this, (GeneratedMessageLite) obj);
    }

    public final int hashCode() {
        int i = this.f164758ag;
        if (i != 0) {
            return i;
        }
        int a = bxxm.f165037a.mo74228a(this).mo74216a(this);
        this.f164758ag = a;
        return a;
    }

    /* renamed from: l */
    public final int mo73643l() {
        return this.f164961ai;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        bxxe.m124169a(this, sb, 0);
        return sb.toString();
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124007a(GeneratedMessageLite GeneratedMessageLite, ByteString bxtx) {
        bxus b = bxus.m123743b();
        try {
            bxuc h = bxtx.mo73764h();
            GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a.mo74220a(GeneratedMessageLite2, bxud.m123454a(h), b);
            a.mo74225d(GeneratedMessageLite2);
            h.mo73787a(0);
            m124027b(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (!(e.getCause() instanceof bxwf)) {
                throw new bxwf(e.getMessage());
            }
            throw ((bxwf) e.getCause());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        } catch (bxwf e3) {
            throw e3;
        } catch (bxwf e4) {
            throw e4;
        }
    }

    /* renamed from: b */
    public static GeneratedMessageLite m124026b(GeneratedMessageLite GeneratedMessageLite, InputStream inputStream) {
        GeneratedMessageLite GeneratedMessageLite2;
        bxus b = bxus.m123743b();
        try {
            int read = inputStream.read();
            if (read != -1) {
                bxuc a = bxuc.m123416a(new bxsx(inputStream, bxuc.m123414a(read, inputStream)));
                GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
                try {
                    bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
                    a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(a), b);
                    a2.mo74225d(GeneratedMessageLite2);
                    try {
                        a.mo73787a(0);
                    } catch (bxwf e) {
                        throw e;
                    }
                } catch (IOException e2) {
                    if (e2.getCause() instanceof bxwf) {
                        throw ((bxwf) e2.getCause());
                    }
                    throw new bxwf(e2.getMessage());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof bxwf) {
                        throw ((bxwf) e3.getCause());
                    }
                    throw e3;
                }
            } else {
                GeneratedMessageLite2 = null;
            }
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e4) {
            throw new bxwf(e4.getMessage());
        }
    }

    /* renamed from: aM */
    public final /* bridge */ /* synthetic */ bxxb mo73645aM() {
        bxvd bxvd = (bxvd) mo74142c(5);
        bxvd.mo73625a(this);
        return bxvd;
    }

    /* renamed from: aR */
    public final /* bridge */ /* synthetic */ bxxb mo73646aR() {
        return (bxvd) mo74142c(5);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ bxxc mo74067j() {
        return (GeneratedMessageLite) mo74142c(6);
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124008a(GeneratedMessageLite GeneratedMessageLite, bxuc bxuc) {
        bxus b = bxus.m123743b();
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a.mo74220a(GeneratedMessageLite2, bxud.m123454a(bxuc), b);
            a.mo74225d(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: b */
    public static void m124027b(GeneratedMessageLite GeneratedMessageLite) {
        if (GeneratedMessageLite != null && !GeneratedMessageLite.mo74020aS()) {
            throw m123094m().mo74281a();
        }
    }

    /* renamed from: a */
    static GeneratedMessageLite m124009a(GeneratedMessageLite GeneratedMessageLite, bxuc bxuc, bxus bxus) {
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a.mo74220a(GeneratedMessageLite2, bxud.m123454a(bxuc), bxus);
            a.mo74225d(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124010a(GeneratedMessageLite GeneratedMessageLite, InputStream inputStream) {
        bxuc a = bxuc.m123416a(inputStream);
        bxus b = bxus.m123743b();
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(a), b);
            a2.mo74225d(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124011a(GeneratedMessageLite GeneratedMessageLite, InputStream inputStream, bxus bxus) {
        bxuc a = bxuc.m123416a(inputStream);
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(a), bxus);
            a2.mo74225d(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124012a(GeneratedMessageLite GeneratedMessageLite, ByteBuffer byteBuffer) {
        bxus b = bxus.m123743b();
        bxuc a = bxuc.m123418a(byteBuffer);
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(a), b);
            a2.mo74225d(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124013a(GeneratedMessageLite GeneratedMessageLite, ByteBuffer byteBuffer, bxus bxus) {
        bxuc a = bxuc.m123418a(byteBuffer);
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a2.mo74220a(GeneratedMessageLite2, bxud.m123454a(a), bxus);
            a2.mo74225d(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            m124027b(GeneratedMessageLite2);
            return GeneratedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof bxwf) {
                throw ((bxwf) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124014a(GeneratedMessageLite GeneratedMessageLite, byte[] bArr) {
        GeneratedMessageLite a = m124015a(GeneratedMessageLite, bArr, 0, bArr.length, bxus.m123743b());
        m124027b(a);
        return a;
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124015a(GeneratedMessageLite GeneratedMessageLite, byte[] bArr, int i, int i2, bxus bxus) {
        GeneratedMessageLite GeneratedMessageLite2 = (GeneratedMessageLite) GeneratedMessageLite.mo74142c(4);
        try {
            bxxv a = bxxm.f165037a.mo74228a(GeneratedMessageLite2);
            a.mo74221a(GeneratedMessageLite2, bArr, i, i + i2, new bxtf(bxus));
            a.mo74225d(GeneratedMessageLite2);
            if (GeneratedMessageLite2.f164758ag == 0) {
                return GeneratedMessageLite2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof bxwf) {
                throw ((bxwf) e.getCause());
            }
            throw new bxwf(e.getMessage());
        } catch (IndexOutOfBoundsException e2) {
            throw bxwf.m124088a();
        }
    }

    /* renamed from: a */
    public static GeneratedMessageLite m124016a(GeneratedMessageLite GeneratedMessageLite, byte[] bArr, bxus bxus) {
        GeneratedMessageLite a = m124015a(GeneratedMessageLite, bArr, 0, bArr.length, bxus);
        m124027b(a);
        return a;
    }

    /* renamed from: a */
    public static bxvn m124017a(bxvn bxvn) {
        int size = bxvn.size();
        return bxvn.mo73728a(size != 0 ? size + size : 10);
    }

    /* renamed from: a */
    public static bxvs m124018a(bxvs bxvs) {
        int size = bxvs.size();
        return bxvs.mo73921a(size != 0 ? size + size : 10);
    }

    /* renamed from: a */
    public static bxvt m124019a(bxvt bxvt) {
        int size = bxvt.size();
        return bxvt.mo74150a(size != 0 ? size + size : 10);
    }

    /* renamed from: a */
    public static bxvw m124020a(bxvw bxvw) {
        int size = bxvw.size();
        return bxvw.mo74162b(size != 0 ? size + size : 10);
    }

    /* renamed from: a */
    public static bxwc m124021a(bxwc bxwc) {
        int size = bxwc.size();
        return bxwc.mo73731c(size != 0 ? size + size : 10);
    }

    /* renamed from: a */
    protected static Object m124022a(bxxc bxxc, String str, Object[] objArr) {
        return new bxxo(bxxc, str, objArr);
    }

    /* renamed from: a */
    static Object m124023a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static void m124024a(Class cls, GeneratedMessageLite GeneratedMessageLite) {
        f164959aj.put(cls, GeneratedMessageLite);
    }

    /* renamed from: a */
    public final bxvd mo74141a(GeneratedMessageLite GeneratedMessageLite) {
        bxvd da = mo74144da();
        da.mo73625a(GeneratedMessageLite);
        return da;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxxv.a(java.lang.Object, bxul):void
     arg types: [GeneratedMessageLite, bxul]
     candidates:
      bxxv.a(java.lang.Object, java.lang.Object):boolean
      bxxv.a(java.lang.Object, bxul):void */
    /* renamed from: a */
    public final void mo73644a(bxuk bxuk) {
        bxxv a = bxxm.f165037a.mo74228a(this);
        bxul bxul = bxuk.f164856f;
        if (bxul == null) {
            bxul = new bxul(bxuk);
        }
        a.mo74219a((Object) this, bxul);
    }
}
