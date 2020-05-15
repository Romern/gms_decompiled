package p000;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bxxg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bxxg implements bxxv {

    /* renamed from: a */
    private final bxxc f165032a;

    /* renamed from: b */
    private final bxyn f165033b;

    /* renamed from: c */
    private final boolean f165034c;

    private bxxg(bxyn bxyn, bxxc bxxc) {
        this.f165033b = bxyn;
        this.f165034c = bxxc instanceof bxvg;
        this.f165032a = bxxc;
    }

    /* renamed from: a */
    static bxxg m124227a(bxyn bxyn, bxut bxut, bxxc bxxc) {
        return new bxxg(bxyn, bxxc);
    }

    /* renamed from: d */
    public final void mo74225d(Object obj) {
        bxyn.m124422c(obj);
        bxut.m123752c(obj);
    }

    /* renamed from: e */
    public final boolean mo74226e(Object obj) {
        return bxut.m123748a(obj).mo73918e();
    }

    /* renamed from: b */
    public final int mo74223b(Object obj) {
        bxyo a = bxyn.m124416a(obj);
        int i = a.f165106e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < a.f165103b; i2++) {
                int i3 = a.f165104c[i2];
                int i4 = bxuk.m123657i(1);
                i += i4 + i4 + bxuk.m123655h(2, bxzh.m124563b(i3)) + bxuk.m123642c(3, (bxtx) a.f165105d[i2]);
            }
            a.f165106e = i;
        }
        if (!this.f165034c) {
            return i;
        }
        bxux a2 = bxut.m123748a(obj);
        int i5 = 0;
        for (int i6 = 0; i6 < a2.f164882a.mo74265a(); i6++) {
            i5 += a2.mo73912b(a2.f164882a.mo74268b(i6));
        }
        for (Map.Entry entry : a2.f164882a.mo74267b()) {
            i5 += a2.mo73912b(entry);
        }
        return i + i5;
    }

    /* renamed from: a */
    public final int mo74216a(Object obj) {
        int hashCode = bxyn.m124416a(obj).hashCode();
        return this.f165034c ? (hashCode * 53) + bxut.m123748a(obj).hashCode() : hashCode;
    }

    /* renamed from: a */
    public final Object mo74218a() {
        return this.f165032a.mo73646aR().mo74057h();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bxul.a(int, java.lang.Object):void
     arg types: [int, bxtx]
     candidates:
      bxul.a(int, double):void
      bxul.a(int, float):void
      bxul.a(int, int):void
      bxul.a(int, long):void
      bxul.a(int, bxtx):void
      bxul.a(int, java.lang.String):void
      bxul.a(int, boolean):void
      bxul.a(int, java.lang.Object):void */
    /* renamed from: a */
    public final void mo74219a(Object obj, bxul bxul) {
        Iterator d = bxut.m123748a(obj).mo73917d();
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            bxvi bxvi = (bxvi) entry.getKey();
            if (bxvi.mo74137a() != bxzg.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof bxwh) {
                bxul.mo73879a(bxvi.f164953a, (Object) ((bxwj) ((bxwh) entry).f164993a.getValue()).mo74186a());
            } else {
                bxul.mo73879a(bxvi.f164953a, entry.getValue());
            }
        }
        bxyo a = bxyn.m124416a(obj);
        for (int i = 0; i < a.f165103b; i++) {
            bxul.mo73879a(bxzh.m124563b(a.f165104c[i]), a.f165105d[i]);
        }
    }

    /* renamed from: b */
    public final void mo74224b(Object obj, Object obj2) {
        bxxw.m124365c(obj, obj2);
        if (this.f165034c) {
            bxxw.m124361b(obj, obj2);
        }
    }

    /* renamed from: a */
    public final void mo74220a(Object obj, bxxp bxxp, bxus bxus) {
        boolean z;
        bxyn bxyn = this.f165033b;
        Object b = bxyn.m124421b(obj);
        bxux b2 = bxut.m123751b(obj);
        while (bxxp.mo73681a() != Integer.MAX_VALUE) {
            try {
                int b3 = bxxp.mo73689b();
                if (b3 == bxzh.f165160a) {
                    int i = 0;
                    bxvj bxvj = null;
                    bxtx bxtx = null;
                    while (true) {
                        if (bxxp.mo73681a() == Integer.MAX_VALUE) {
                            break;
                        }
                        int b4 = bxxp.mo73689b();
                        if (b4 == bxzh.f165162c) {
                            i = bxxp.mo73718o();
                            bxvj = bxus.mo73903a(this.f165032a, i);
                        } else if (b4 != bxzh.f165163d) {
                            if (!bxxp.mo73695c()) {
                                break;
                            }
                        } else if (bxvj != null) {
                            bxut.m123750a(bxxp, bxvj, bxus, b2);
                        } else {
                            bxtx = bxxp.mo73716n();
                        }
                    }
                    if (bxxp.mo73689b() != bxzh.f165161b) {
                        throw bxwf.m124092e();
                    } else if (bxtx == null) {
                        continue;
                    } else if (bxvj != null) {
                        bxxc h = bxvj.f164957c.mo73646aR().mo74057h();
                        ByteBuffer wrap = ByteBuffer.wrap(bxtx.mo73780k());
                        if (wrap.hasArray()) {
                            bxth bxth = new bxth(wrap);
                            bxxm.f165037a.mo74228a(h).mo74220a(h, bxth, bxus);
                            b2.mo73908a(bxvj.f164958d, h);
                            if (bxth.mo73681a() != Integer.MAX_VALUE) {
                                throw bxwf.m124092e();
                            }
                        } else {
                            throw new IllegalArgumentException("Direct buffers not yet supported");
                        }
                    } else {
                        ((bxyo) b).mo74283a(bxzh.m124562a(i, 2), bxtx);
                    }
                } else {
                    if (bxzh.m124561a(b3) == 2) {
                        bxvj a = bxus.mo73903a(this.f165032a, bxzh.m124563b(b3));
                        if (a == null) {
                            z = bxyn.mo74282a(b, bxxp);
                        } else {
                            bxut.m123750a(bxxp, a, bxus, b2);
                        }
                    } else {
                        z = bxxp.mo73695c();
                    }
                    if (!z) {
                        break;
                    }
                }
            } finally {
                bxyn.m124419a(obj, (bxyo) b);
            }
        }
    }

    /* renamed from: a */
    public final void mo74221a(Object obj, byte[] bArr, int i, int i2, bxtf bxtf) {
        bxvk bxvk = (bxvk) obj;
        bxyo bxyo = bxvk.f164960ah;
        if (bxyo == bxyo.f165102a) {
            bxyo = bxyo.m124424a();
            bxvk.f164960ah = bxyo;
        }
        bxux c = ((bxvg) obj).mo74136c();
        bxvj bxvj = null;
        while (i < i2) {
            int a = bxtg.m123141a(bArr, i, bxtf);
            int i3 = bxtf.f164767a;
            if (i3 == bxzh.f165160a) {
                int i4 = 0;
                bxtx bxtx = null;
                while (a < i2) {
                    a = bxtg.m123141a(bArr, a, bxtf);
                    int i5 = bxtf.f164767a;
                    int a2 = bxzh.m124561a(i5);
                    int b = bxzh.m124563b(i5);
                    if (b != 2) {
                        if (b == 3) {
                            if (bxvj != null) {
                                a = bxtg.m123139a(bxxm.f165037a.mo74227a((Class) bxvj.f164957c.getClass()), bArr, a, i2, bxtf);
                                c.mo73908a(bxvj.f164958d, bxtf.f164769c);
                            } else if (a2 == 2) {
                                a = bxtg.m123149e(bArr, a, bxtf);
                                bxtx = (bxtx) bxtf.f164769c;
                            }
                        }
                    } else if (a2 == 0) {
                        a = bxtg.m123141a(bArr, a, bxtf);
                        i4 = bxtf.f164767a;
                        bxvj = bxtf.f164770d.mo73903a(this.f165032a, i4);
                    }
                    if (i5 == bxzh.f165161b) {
                        break;
                    }
                    a = bxtg.m123133a(i5, bArr, a, i2, bxtf);
                }
                if (bxtx != null) {
                    bxyo.mo74283a(bxzh.m124562a(i4, 2), bxtx);
                }
                i = a;
            } else if (bxzh.m124561a(i3) == 2) {
                bxvj a3 = bxtf.f164770d.mo73903a(this.f165032a, bxzh.m124563b(i3));
                if (a3 == null) {
                    i = bxtg.m123135a(i3, bArr, a, i2, bxyo, bxtf);
                    bxvj = a3;
                } else {
                    i = bxtg.m123139a(bxxm.f165037a.mo74227a((Class) a3.f164957c.getClass()), bArr, a, i2, bxtf);
                    c.mo73908a(a3.f164958d, bxtf.f164769c);
                    bxvj = a3;
                }
            } else {
                i = bxtg.m123133a(i3, bArr, a, i2, bxtf);
            }
        }
        if (i != i2) {
            throw bxwf.m124095h();
        }
    }

    /* renamed from: a */
    public final boolean mo74222a(Object obj, Object obj2) {
        if (!bxyn.m124416a(obj).equals(bxyn.m124416a(obj2))) {
            return false;
        }
        if (this.f165034c) {
            return bxut.m123748a(obj).equals(bxut.m123748a(obj2));
        }
        return true;
    }
}
