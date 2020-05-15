package p000;

import android.net.Uri;

/* renamed from: aeef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeef {

    /* renamed from: a */
    public final bylh f63268a;

    public aeef(bylh bylh) {
        this.f63268a = bylh;
    }

    /* renamed from: a */
    static bmzi m51716a(bmzi bmzi) {
        return new aeee(bmzi);
    }

    /* renamed from: a */
    public static void m51717a(bykz bykz, aebz aebz) {
        int a = bykw.m124916a(bykz.f166795b);
        if (a == 0) {
            a = 1;
        }
        Integer c = m51718c(a);
        int a2 = bykw.m124916a(bykz.f166803j);
        if (a2 == 0) {
            a2 = 1;
        }
        Integer c2 = m51718c(a2);
        if (c != null && c2 != null) {
            aebz.mo34028b(c.intValue(), c2.intValue());
        } else if (c != null) {
            aebz.mo34023a(c.intValue());
        }
        int a3 = byku.m124914a(bykz.f166796c);
        if (a3 == 0) {
            a3 = 1;
        }
        Integer d = m51719d(a3);
        int a4 = byku.m124914a(bykz.f166804k);
        if (a4 == 0) {
            a4 = 1;
        }
        Integer d2 = m51719d(a4);
        if (d != null && d2 != null) {
            aebz.mo34024a(d.intValue(), d2.intValue());
        } else if (d != null) {
            aebz.mo34024a(d.intValue(), d.intValue());
        }
        int a5 = byky.m124918a(bykz.f166799f);
        if (a5 == 0) {
            a5 = 4;
        }
        int i = a5 - 1;
        if (i == 1) {
            aebz.mo34027b(0);
        } else if (i == 2) {
            aebz.mo34027b(1);
        } else if (i == 3) {
            aebz.mo34027b(2);
        }
        if ((bykz.f166794a & 16) != 0) {
            aebz.f63102n = bykz.f166800g;
        }
        if (bykz.f166798e.size() != 0) {
            bnia j = bnic.m109500j();
            bxwc bxwc = bykz.f166798e;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                j.mo67629b(Uri.parse((String) bxwc.get(i2)));
            }
            aebz.mo34025a(j.mo67751a());
        }
        if ((bykz.f166794a & 4) != 0) {
            aebz.mo34026a(bykz.f166797d);
        }
        if ((bykz.f166794a & 32) != 0) {
            aebn aebn = new aebn();
            bykl bykl = bykz.f166801h;
            if (bykl == null) {
                bykl = bykl.f166763e;
            }
            if ((bykl.f166765a & 1) != 0) {
                int a6 = bykk.m124904a(bykl.f166766b);
                if (a6 == 0) {
                    a6 = 1;
                }
                int i3 = a6 - 1;
                if (i3 == 0 || i3 == 1) {
                    aebn.f63074a = 0;
                } else {
                    aebn.f63074a = 1;
                }
            }
            if ((bykl.f166765a & 2) != 0) {
                bxun bxun = bykl.f166767c;
                if (bxun == null) {
                    bxun = bxun.f164861c;
                }
                aebn.f63075b = (int) bxzr.m124574a(bxun);
            }
            if ((bykl.f166765a & 4) != 0) {
                bxun bxun2 = bykl.f166768d;
                if (bxun2 == null) {
                    bxun2 = bxun.f164861c;
                }
                aebn.f63076c = (int) bxzr.m124574a(bxun2);
            }
            aebz.f63106r = aebn.mo34011a();
        }
    }

    /* renamed from: c */
    private static Integer m51718c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 3 ? null : 2;
        }
        return 1;
    }

    /* renamed from: d */
    private static Integer m51719d(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            return i2 != 2 ? null : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byks mo34091b(int i) {
        bylh bylh = this.f63268a;
        if (bylh == null) {
            return null;
        }
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            byla byla = bylh.f166835b;
            if (byla == null) {
                byla = byla.f166805d;
            }
            bykf bykf = byla.f166808b;
            if (bykf == null) {
                bykf = bykf.f166742c;
            }
            bykz bykz = bykf.f166744a;
            if (bykz == null) {
                bykz = bykz.f166792l;
            }
            byks byks = bykz.f166802i;
            if (byks == null) {
                return byks.f166786b;
            }
            return byks;
        } else if (i2 != 2) {
            return null;
        } else {
            byla byla2 = bylh.f166835b;
            if (byla2 == null) {
                byla2 = byla.f166805d;
            }
            bykh bykh = byla2.f166809c;
            if (bykh == null) {
                bykh = bykh.f166752c;
            }
            bykz bykz2 = bykh.f166754a;
            if (bykz2 == null) {
                bykz2 = bykz.f166792l;
            }
            byks byks2 = bykz2.f166802i;
            if (byks2 == null) {
                return byks.f166786b;
            }
            return byks2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo34090a(int i) {
        bylh bylh = this.f63268a;
        if (bylh == null) {
            return false;
        }
        byla byla = bylh.f166835b;
        if (byla == null) {
            byla = byla.f166805d;
        }
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 == 2 && (2 & byla.f166807a) != 0 : (byla.f166807a & 1) != 0 : (2 & this.f63268a.f166834a) != 0;
        }
        throw null;
    }
}
