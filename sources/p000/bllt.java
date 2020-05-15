package p000;

import java.lang.reflect.Field;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: bllt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bllt {

    /* renamed from: a */
    public final ArrayDeque f126805a;

    private bllt() {
        this.f126805a = new ArrayDeque();
    }

    /* renamed from: a */
    public static bllt m107329a() {
        return new bllt();
    }

    /* renamed from: h */
    private final bllu m107334h() {
        String str = (String) m107332a(bllx.OBJECT, blls.f126804a, false);
        if (!str.isEmpty()) {
            try {
                Field field = Class.forName(str).getField("READER");
                field.setAccessible(true);
                return (bllu) field.get(null);
            } catch (ClassCastException | IllegalAccessException | NoSuchFieldException e) {
                throw new blmh(new bllj("Bundleable must have a non-null static member variable named READER of a type that implements Bundleable.Reader", e));
            } catch (Exception e2) {
                throw new blmh(e2);
            }
        } else {
            throw new blmh("Failed to read object. Are the calls to read symmetric?");
        }
    }

    /* renamed from: i */
    private final blly m107335i() {
        if (!this.f126805a.isEmpty()) {
            return (blly) this.f126805a.peek();
        }
        throw new blmh("Cannot read from an empty bundle.");
    }

    /* renamed from: b */
    public final void mo66671b(bllv bllv) {
        bllt a = m107329a();
        bllv.writeToBundle(a);
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.OBJECT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        blly.f126822a |= 1;
        arrayDeque.add((blly) da.mo74062i());
        m107333a(a);
    }

    /* renamed from: c */
    public final int mo66673c() {
        return ((Integer) m107331a(bllx.INT32, bllo.f126800a)).intValue();
    }

    /* renamed from: d */
    public final float mo66674d() {
        return ((Float) m107331a(bllx.FLOAT, bllp.f126801a)).floatValue();
    }

    /* renamed from: e */
    public final double mo66675e() {
        return ((Double) m107331a(bllx.DOUBLE, bllq.f126802a)).doubleValue();
    }

    /* renamed from: f */
    public final String mo66676f() {
        return (String) m107331a(bllx.STRING, bllr.f126803a);
    }

    /* renamed from: g */
    public final bllv mo66677g() {
        return mo66664a(m107334h());
    }

    /* renamed from: a */
    public static bllt m107330a(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        try {
            if (wrap.getInt() <= 1) {
                byte[] bArr2 = new byte[wrap.getInt()];
                byte[] bArr3 = new byte[wrap.remaining()];
                wrap.get(bArr3);
                Inflater inflater = new Inflater();
                inflater.setInput(bArr3);
                inflater.inflate(bArr2);
                inflater.end();
                try {
                    bxwc bxwc = ((bllz) bxvk.m124014a(bllz.f126829b, bArr2)).f126831a;
                    Stream map = bxwc.stream().map(bllk.f126796a);
                    bllx bllx = bllx.UNKNOWN;
                    bllx.getClass();
                    if (!map.anyMatch(new bllm(bllx))) {
                        return new bllt(bxwc);
                    }
                    throw new blma("Failed to parse bundle.");
                } catch (bxwf e) {
                    throw new blma(e);
                }
            } else {
                throw new blma("Bundle encoded with newer version than v1");
            }
        } catch (BufferUnderflowException | DataFormatException e2) {
            throw new blma(e2);
        }
    }

    private bllt(List list) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f126805a = arrayDeque;
        arrayDeque.addAll(list);
    }

    /* renamed from: b */
    public final boolean mo66672b() {
        return ((Boolean) m107331a(bllx.BOOL, blln.f126799a)).booleanValue();
    }

    /* renamed from: a */
    private final Object m107331a(bllx bllx, Function function) {
        return m107332a(bllx, function, true);
    }

    /* renamed from: a */
    private final Object m107332a(bllx bllx, Function function, boolean z) {
        blly i = m107335i();
        bllx a = bllx.m107351a(i.f126823b);
        if (a == null) {
            a = bllx.UNKNOWN;
        }
        if (a != bllx) {
            bllx a2 = bllx.m107351a(i.f126823b);
            if (a2 == null) {
                a2 = bllx.UNKNOWN;
            }
            String valueOf = String.valueOf(a2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
            sb.append("Failed to read type: ");
            sb.append(valueOf);
            sb.append(". Are the calls to read symmetric?");
            throw new blmh(sb.toString());
        }
        Object apply = function.apply(i);
        if (z) {
            this.f126805a.remove();
        }
        return apply;
    }

    /* renamed from: a */
    private final void m107333a(bllt bllt) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.BUNDLE_START;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        blly.f126822a |= 1;
        arrayDeque.add((blly) da.mo74062i());
        this.f126805a.addAll(bllt.f126805a);
        ArrayDeque arrayDeque2 = this.f126805a;
        bxvd da2 = blly.f126820h.mo74144da();
        bllx bllx2 = bllx.BUNDLE_END;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blly blly2 = (blly) da2.f164949b;
        blly2.f126823b = bllx2.f126819l;
        blly2.f126822a |= 1;
        arrayDeque2.add((blly) da2.mo74062i());
    }

    /* renamed from: a */
    public final bllv mo66664a(bllu bllu) {
        blly blly = (blly) m107331a(bllx.OBJECT, blll.f126797a);
        try {
            bllx a = bllx.m107351a(m107335i().f126823b);
            if (a == null) {
                a = bllx.UNKNOWN;
            }
            if (a == bllx.BUNDLE_START) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f126805a.iterator();
                int i = 0;
                while (it.hasNext()) {
                    blly blly2 = (blly) it.next();
                    bllx a2 = bllx.m107351a(blly2.f126823b);
                    if (a2 == null) {
                        a2 = bllx.UNKNOWN;
                    }
                    if (a2 == bllx.BUNDLE_START) {
                        i++;
                    } else {
                        bllx a3 = bllx.m107351a(blly2.f126823b);
                        if (a3 == null) {
                            a3 = bllx.UNKNOWN;
                        }
                        if (a3 == bllx.BUNDLE_END) {
                            i--;
                        }
                    }
                    arrayList.add(blly2);
                    if (i == 0) {
                        break;
                    }
                }
                if (i == 0) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        this.f126805a.remove();
                    }
                    arrayList.remove(arrayList.size() - 1);
                    arrayList.remove(0);
                    return bllu.readFromBundle(new bllt(arrayList));
                }
                throw new blmh("Failed to successfully parse bundle.");
            }
            throw new blmh("Failed to read bundle. Are the calls to read symmetric?");
        } catch (blmh e) {
            this.f126805a.addFirst(blly);
            throw e;
        } catch (Exception e2) {
            this.f126805a.addFirst(blly);
            throw new blmh(e2);
        }
    }

    /* renamed from: a */
    public final void mo66665a(double d) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.DOUBLE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        int i = blly.f126822a | 1;
        blly.f126822a = i;
        blly.f126822a = i | 128;
        blly.f126828g = d;
        arrayDeque.add((blly) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo66666a(float f) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.FLOAT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        int i = blly.f126822a | 1;
        blly.f126822a = i;
        blly.f126822a = i | 64;
        blly.f126827f = f;
        arrayDeque.add((blly) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo66667a(int i) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.INT32;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        int i2 = blly.f126822a | 1;
        blly.f126822a = i2;
        blly.f126822a = i2 | 4;
        blly.f126824c = i;
        arrayDeque.add((blly) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo66668a(bllv bllv) {
        bllt a = m107329a();
        bllv.writeToBundle(a);
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.OBJECT;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        blly.f126822a |= 1;
        String name = bllv.getClass().getName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly2 = (blly) da.f164949b;
        name.getClass();
        blly2.f126822a |= 16;
        blly2.f126825d = name;
        arrayDeque.add((blly) da.mo74062i());
        m107333a(a);
    }

    /* renamed from: a */
    public final void mo66669a(String str) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.STRING;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        int i = blly.f126822a | 1;
        blly.f126822a = i;
        str.getClass();
        blly.f126822a = i | 16;
        blly.f126825d = str;
        arrayDeque.add((blly) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo66670a(boolean z) {
        ArrayDeque arrayDeque = this.f126805a;
        bxvd da = blly.f126820h.mo74144da();
        bllx bllx = bllx.BOOL;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        blly blly = (blly) da.f164949b;
        blly.f126823b = bllx.f126819l;
        int i = blly.f126822a | 1;
        blly.f126822a = i;
        blly.f126822a = i | 32;
        blly.f126826e = z;
        arrayDeque.add((blly) da.mo74062i());
    }
}
