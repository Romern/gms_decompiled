package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bxux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxux {

    /* renamed from: c */
    public static final bxux f164881c = new bxux(null);

    /* renamed from: a */
    final bxyd f164882a = bxyd.m124396a(16);

    /* renamed from: b */
    public boolean f164883b;

    /* renamed from: d */
    private boolean f164884d;

    private bxux() {
    }

    /* renamed from: a */
    static int m123758a(bxzf bxzf, int i, Object obj) {
        int i2 = bxuk.m123657i(i);
        if (bxzf == bxzf.GROUP) {
            bxwd.m124082a((bxxc) obj);
            i2 += i2;
        }
        bxzg bxzg = bxzg.INT;
        int i3 = 4;
        switch (bxzf.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                i3 = 8;
                break;
            case 1:
                ((Float) obj).floatValue();
                break;
            case 2:
                i3 = bxuk.m123651f(((Long) obj).longValue());
                break;
            case 3:
                i3 = bxuk.m123651f(((Long) obj).longValue());
                break;
            case 4:
                i3 = bxuk.m123659j(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                i3 = 8;
                break;
            case 6:
                ((Integer) obj).intValue();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                i3 = 1;
                break;
            case 8:
                if (!(obj instanceof bxtx)) {
                    i3 = bxuk.m123641b((String) obj);
                    break;
                } else {
                    i3 = bxuk.m123640b((bxtx) obj);
                    break;
                }
            case 9:
                i3 = bxuk.m123648e((bxxc) obj);
                break;
            case 10:
                if (!(obj instanceof bxwj)) {
                    i3 = bxuk.m123643c((bxxc) obj);
                    break;
                } else {
                    i3 = bxuk.m123632a((bxwj) obj);
                    break;
                }
            case 11:
                if (!(obj instanceof bxtx)) {
                    i3 = bxuk.m123646d((byte[]) obj);
                    break;
                } else {
                    i3 = bxuk.m123640b((bxtx) obj);
                    break;
                }
            case 12:
                i3 = bxuk.m123661k(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof bxvp)) {
                    i3 = bxuk.m123659j(((Integer) obj).intValue());
                    break;
                } else {
                    i3 = bxuk.m123659j(((bxvp) obj).mo3214a());
                    break;
                }
            case 14:
                ((Integer) obj).intValue();
                break;
            case 15:
                ((Long) obj).longValue();
                i3 = 8;
                break;
            case 16:
                i3 = bxuk.m123662l(((Integer) obj).intValue());
                break;
            case 17:
                i3 = bxuk.m123654g(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i2 + i3;
    }

    /* renamed from: b */
    public static int m123761b(bxvi bxvi, Object obj) {
        return m123758a(bxvi.f164954b, bxvi.f164953a, obj);
    }

    /* renamed from: c */
    private static boolean m123762c(Map.Entry entry) {
        if (((bxvi) entry.getKey()).mo74137a() == bxzg.MESSAGE) {
            Object value = entry.getValue();
            if (value instanceof bxxc) {
                if (!((bxxc) value).mo74020aS()) {
                    return false;
                }
            } else if (value instanceof bxwj) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: d */
    public final Iterator mo73917d() {
        if (this.f164884d) {
            return new bxwi(this.f164882a.entrySet().iterator());
        }
        return this.f164882a.entrySet().iterator();
    }

    /* renamed from: e */
    public final boolean mo73918e() {
        for (int i = 0; i < this.f164882a.mo74265a(); i++) {
            if (!m123762c(this.f164882a.mo74268b(i))) {
                return false;
            }
        }
        for (Map.Entry entry : this.f164882a.mo74267b()) {
            if (!m123762c(entry)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bxux) {
            return this.f164882a.equals(((bxux) obj).f164882a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f164882a.hashCode();
    }

    private bxux(byte[] bArr) {
        mo73914b();
        mo73914b();
    }

    /* renamed from: b */
    public final int mo73912b(Map.Entry entry) {
        bxvi bxvi = (bxvi) entry.getKey();
        Object value = entry.getValue();
        if (bxvi.mo74137a() != bxzg.MESSAGE) {
            return m123761b(bxvi, value);
        }
        if (value instanceof bxwj) {
            int i = ((bxvi) entry.getKey()).f164953a;
            int i2 = bxuk.m123657i(1);
            return i2 + i2 + bxuk.m123655h(2, i) + bxuk.m123631a(3, (bxwj) value);
        }
        int i3 = ((bxvi) entry.getKey()).f164953a;
        int i4 = bxuk.m123657i(1);
        return i4 + i4 + bxuk.m123655h(2, i3) + bxuk.m123652f((bxxc) value);
    }

    /* renamed from: c */
    public final bxux clone() {
        bxux bxux = new bxux();
        for (int i = 0; i < this.f164882a.mo74265a(); i++) {
            Map.Entry b = this.f164882a.mo74268b(i);
            bxux.mo73908a((bxvi) b.getKey(), b.getValue());
        }
        for (Map.Entry entry : this.f164882a.mo74267b()) {
            bxux.mo73908a((bxvi) entry.getKey(), entry.getValue());
        }
        bxux.f164884d = this.f164884d;
        return bxux;
    }

    /* renamed from: b */
    public final Object mo73913b(bxvi bxvi) {
        Object obj = this.f164882a.get(bxvi);
        if (!(obj instanceof bxwj)) {
            return obj;
        }
        bxwj bxwj = (bxwj) obj;
        throw null;
    }

    /* renamed from: b */
    public final void mo73914b() {
        Map map;
        Map map2;
        if (!this.f164883b) {
            bxyd bxyd = this.f164882a;
            if (!bxyd.f165083c) {
                for (int i = 0; i < bxyd.mo74265a(); i++) {
                    bxvi bxvi = (bxvi) bxyd.mo74268b(i).getKey();
                }
                for (Map.Entry entry : bxyd.mo74267b()) {
                    bxvi bxvi2 = (bxvi) entry.getKey();
                }
            }
            if (!bxyd.f165083c) {
                if (bxyd.f165082b.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(bxyd.f165082b);
                }
                bxyd.f165082b = map;
                if (!bxyd.f165084d.isEmpty()) {
                    map2 = Collections.unmodifiableMap(bxyd.f165084d);
                } else {
                    map2 = Collections.emptyMap();
                }
                bxyd.f165084d = map2;
                bxyd.f165083c = true;
            }
            this.f164883b = true;
        }
    }

    /* renamed from: a */
    private static Object m123759a(Object obj) {
        if (obj instanceof bxxh) {
            return ((bxxh) obj).mo73647c();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: a */
    static void m123760a(bxuk bxuk, bxzf bxzf, int i, Object obj) {
        if (bxzf == bxzf.GROUP) {
            bxxc bxxc = (bxxc) obj;
            bxwd.m124082a(bxxc);
            bxuk.mo73845b(i, 3);
            bxuk.mo73869d(bxxc);
            bxuk.mo73845b(i, 4);
            return;
        }
        bxuk.mo73845b(i, bxzf.f165149t);
        bxzg bxzg = bxzg.INT;
        switch (bxzf.ordinal()) {
            case 0:
                bxuk.mo73860a(((Double) obj).doubleValue());
                return;
            case 1:
                bxuk.mo73861a(((Float) obj).floatValue());
                return;
            case 2:
                bxuk.mo73854c(((Long) obj).longValue());
                return;
            case 3:
                bxuk.mo73854c(((Long) obj).longValue());
                return;
            case 4:
                bxuk.mo73852c(((Integer) obj).intValue());
                return;
            case 5:
                bxuk.mo73857d(((Long) obj).longValue());
                return;
            case 6:
                bxuk.mo73858e(((Integer) obj).intValue());
                return;
            case 7:
                bxuk.mo73843b(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                return;
            case 8:
                if (obj instanceof bxtx) {
                    bxuk.mo73838a((bxtx) obj);
                    return;
                } else {
                    bxuk.mo73840a((String) obj);
                    return;
                }
            case 9:
                bxuk.mo73869d((bxxc) obj);
                return;
            case 10:
                bxuk.mo73839a((bxxc) obj);
                return;
            case 11:
                if (obj instanceof bxtx) {
                    bxuk.mo73838a((bxtx) obj);
                    return;
                } else {
                    bxuk.mo73867c((byte[]) obj);
                    return;
                }
            case 12:
                bxuk.mo73855d(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof bxvp) {
                    bxuk.mo73852c(((bxvp) obj).mo3214a());
                    return;
                } else {
                    bxuk.mo73852c(((Integer) obj).intValue());
                    return;
                }
            case 14:
                bxuk.mo73858e(((Integer) obj).intValue());
                return;
            case 15:
                bxuk.mo73857d(((Long) obj).longValue());
                return;
            case 16:
                bxuk.mo73873h(((Integer) obj).intValue());
                return;
            case 17:
                bxuk.mo73870e(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r0 == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r4 instanceof p000.bxwj) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r4 instanceof p000.bxvp) == false) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
    /* renamed from: a */
    public final void mo73908a(bxvi bxvi, Object obj) {
        boolean z;
        bxzf bxzf = bxvi.f164954b;
        bxwd.m124083a(obj);
        bxzf bxzf2 = bxzf.DOUBLE;
        bxzg bxzg = bxzg.INT;
        switch (bxzf.f165148s.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof bxtx)) {
                    break;
                }
                if (obj instanceof bxwj) {
                    this.f164884d = true;
                }
                this.f164882a.put(bxvi, obj);
                return;
            case 7:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof bxwj) {
                }
                this.f164882a.put(bxvi, obj);
                return;
            case 8:
                if (!(obj instanceof bxxc)) {
                    break;
                }
                if (obj instanceof bxwj) {
                }
                this.f164882a.put(bxvi, obj);
                return;
            default:
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* renamed from: a */
    public final void mo73909a(Map.Entry entry) {
        bxvi bxvi = (bxvi) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof bxwj) {
            bxwj bxwj = (bxwj) value;
            throw null;
        } else if (bxvi.mo74137a() == bxzg.MESSAGE) {
            Object b = mo73913b(bxvi);
            if (b == null) {
                this.f164882a.put(bxvi, m123759a(value));
            } else if (!(b instanceof bxxh)) {
                bxvd bxvd = (bxvd) ((bxxc) b).mo73645aM();
                bxvd.mo73625a((bxvk) ((bxxc) value));
                this.f164882a.put(bxvi, bxvd.mo74062i());
            } else {
                bxxh bxxh = (bxxh) b;
                bxxh bxxh2 = (bxxh) value;
                throw new UnsupportedOperationException();
            }
        } else {
            this.f164882a.put(bxvi, m123759a(value));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo73910a() {
        return this.f164882a.isEmpty();
    }

    /* renamed from: a */
    public final boolean mo73911a(bxvi bxvi) {
        return this.f164882a.get(bxvi) != null;
    }
}
