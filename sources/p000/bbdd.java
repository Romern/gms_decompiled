package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bbdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbdd {

    /* renamed from: a */
    public final Context f102402a;

    /* renamed from: b */
    public final bawt f102403b;

    /* renamed from: c */
    public final bmxv f102404c;

    public bbdd(Context context, bawt bawt, bmxv bmxv) {
        this.f102402a = context;
        this.f102403b = bawt;
        this.f102404c = bmxv;
    }

    /* renamed from: a */
    public static bavt m87829a(bauy bauy, int i) {
        bxvd da = bavt.f101927g.mo74144da();
        String str = bauy.f101851c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavt bavt = (bavt) da.f164949b;
        str.getClass();
        int i2 = bavt.f101929a | 1;
        bavt.f101929a = i2;
        bavt.f101930b = str;
        int i3 = bauy.f101852d;
        bavt.f101929a = i2 | 2;
        bavt.f101931c = i3;
        String b = bbfe.m87923b(bauy);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bavt bavt2 = (bavt) da.f164949b;
        b.getClass();
        int i4 = bavt2.f101929a | 4;
        bavt2.f101929a = i4;
        bavt2.f101932d = b;
        bavt2.f101933e = i - 1;
        bavt2.f101929a = i4 | 8;
        if ((bauy.f101849a & 32) != 0) {
            bzny bzny = bauy.f101855g;
            if (bzny == null) {
                bzny = bzny.f170777b;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavt bavt3 = (bavt) da.f164949b;
            bzny.getClass();
            bavt3.f101934f = bzny;
            bavt3.f101929a |= 16;
        }
        return (bavt) da.mo74062i();
    }

    /* renamed from: b */
    public static String m87831b(bavt bavt) {
        String str;
        StringBuilder sb = new StringBuilder(bavt.f101930b);
        sb.append("|");
        sb.append(bavt.f101931c);
        sb.append("|");
        sb.append(bavt.f101932d);
        sb.append("|");
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        sb.append("|");
        if ((bavt.f101929a & 16) == 0) {
            str = "";
        } else {
            bzny bzny = bavt.f101934f;
            if (bzny == null) {
                bzny = bzny.f170777b;
            }
            str = bbfh.m87931a(bzny);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: c */
    public static String m87832c(bavt bavt) {
        StringBuilder sb = new StringBuilder(bavt.f101932d);
        sb.append("|");
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m87833d(bavt bavt) {
        StringBuilder sb = new StringBuilder(bavt.f101930b);
        sb.append("|");
        sb.append(bavt.f101931c);
        sb.append("|");
        sb.append(bavt.f101932d);
        sb.append("|");
        int a = bavb.m87594a(bavt.f101933e);
        if (a == 0) {
            a = 1;
        }
        sb.append(a - 1);
        return sb.toString();
    }

    /* renamed from: b */
    public final bqgg mo56081b() {
        bbfh.m87928a(this.f102402a, "gms_icing_mdd_shared_files", this.f102404c).edit().clear().commit();
        return bqga.m112775a((Object) null);
    }

    /* renamed from: a */
    static String m87830a(bavt bavt, Context context, bawt bawt) {
        bbba bbba = bbba.NEW_FILE_KEY;
        int ordinal = bbbb.m87767a(context, bawt).ordinal();
        if (ordinal == 0) {
            return m87833d(bavt);
        }
        if (ordinal == 1) {
            return m87831b(bavt);
        }
        if (ordinal != 2) {
            return m87833d(bavt);
        }
        return m87832c(bavt);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bavt mo56077a(String str) {
        bxvd bxvd;
        List c = bmyx.m108643a("|").mo66925c((CharSequence) str);
        bbba bbba = bbba.NEW_FILE_KEY;
        int ordinal = bbbb.m87767a(this.f102402a, this.f102403b).ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (c.size() != 4) {
                    String valueOf = String.valueOf(str);
                    throw new bbdc(valueOf.length() == 0 ? new String("Bad-format serializedFileKey = ") : "Bad-format serializedFileKey = ".concat(valueOf));
                }
                bxvd = bavt.f101927g.mo74144da();
                String str2 = (String) c.get(0);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt = (bavt) bxvd.f164949b;
                str2.getClass();
                bavt.f101929a |= 1;
                bavt.f101930b = str2;
                int parseInt = Integer.parseInt((String) c.get(1));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt2 = (bavt) bxvd.f164949b;
                bavt2.f101929a |= 2;
                bavt2.f101931c = parseInt;
                String str3 = (String) c.get(2);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt3 = (bavt) bxvd.f164949b;
                str3.getClass();
                bavt3.f101929a |= 4;
                bavt3.f101932d = str3;
                int a = bavb.m87594a(Integer.parseInt((String) c.get(3)));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt4 = (bavt) bxvd.f164949b;
                int i = a - 1;
                if (a != 0) {
                    bavt4.f101933e = i;
                    bavt4.f101929a |= 8;
                } else {
                    throw null;
                }
            } else if (c.size() != 2) {
                String valueOf2 = String.valueOf(str);
                throw new bbdc(valueOf2.length() == 0 ? new String("Bad-format serializedFileKey = s") : "Bad-format serializedFileKey = s".concat(valueOf2));
            } else {
                bxvd = bavt.f101927g.mo74144da();
                String str4 = (String) c.get(0);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt5 = (bavt) bxvd.f164949b;
                str4.getClass();
                bavt5.f101929a |= 4;
                bavt5.f101932d = str4;
                int a2 = bavb.m87594a(Integer.parseInt((String) c.get(1)));
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bavt bavt6 = (bavt) bxvd.f164949b;
                int i2 = a2 - 1;
                if (a2 != 0) {
                    bavt6.f101933e = i2;
                    bavt6.f101929a |= 8;
                } else {
                    throw null;
                }
            }
        } else if (c.size() != 5) {
            String valueOf3 = String.valueOf(str);
            throw new bbdc(valueOf3.length() == 0 ? new String("Bad-format serializedFileKey = ") : "Bad-format serializedFileKey = ".concat(valueOf3));
        } else {
            bxvd da = bavt.f101927g.mo74144da();
            String str5 = (String) c.get(0);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavt bavt7 = (bavt) da.f164949b;
            str5.getClass();
            bavt7.f101929a |= 1;
            bavt7.f101930b = str5;
            int parseInt2 = Integer.parseInt((String) c.get(1));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavt bavt8 = (bavt) da.f164949b;
            bavt8.f101929a |= 2;
            bavt8.f101931c = parseInt2;
            String str6 = (String) c.get(2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavt bavt9 = (bavt) da.f164949b;
            str6.getClass();
            bavt9.f101929a |= 4;
            bavt9.f101932d = str6;
            int a3 = bavb.m87594a(Integer.parseInt((String) c.get(3)));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavt bavt10 = (bavt) da.f164949b;
            int i3 = a3 - 1;
            if (a3 != 0) {
                bavt10.f101933e = i3;
                bavt10.f101929a |= 8;
                if (c.get(4) != null && !((String) c.get(4)).isEmpty()) {
                    try {
                        bzny bzny = (bzny) bbfh.m87930a((String) c.get(4), (bxxk) bzny.f170777b.mo74142c(7));
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bavt bavt11 = (bavt) da.f164949b;
                        bzny.getClass();
                        bavt11.f101934f = bzny;
                        bavt11.f101929a |= 16;
                    } catch (bxwf e) {
                        String valueOf4 = String.valueOf(str);
                        throw new bbdc(valueOf4.length() == 0 ? new String("Failed to deserialize key:") : "Failed to deserialize key:".concat(valueOf4), e);
                    }
                }
                bxvd = da;
            } else {
                throw null;
            }
        }
        return (bavt) bxvd.mo74062i();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final bqgg mo56078a() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = bbfh.m87928a(this.f102402a, "gms_icing_mdd_shared_files", this.f102404c);
        SharedPreferences.Editor editor = null;
        for (String str : a.getAll().keySet()) {
            try {
                arrayList.add(mo56077a(str));
            } catch (bbdc e) {
                String valueOf = String.valueOf(str);
                bbev.m87907a(e, valueOf.length() == 0 ? new String("Failed to deserialize newFileKey:") : "Failed to deserialize newFileKey:".concat(valueOf));
                bawt bawt = this.f102403b;
                int size = bmyx.m108643a("|").mo66925c((CharSequence) str).size();
                StringBuilder sb = new StringBuilder(65);
                sb.append("Failed to deserialize newFileKey, unexpected key size:");
                sb.append(size);
                bawt.mo55999a(sb.toString(), e);
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return bqga.m112775a((Object) arrayList);
    }

    /* renamed from: a */
    public final bqgg mo56079a(bavt bavt) {
        return bqga.m112775a((bavu) bbfh.m87929a(bbfh.m87928a(this.f102402a, "gms_icing_mdd_shared_files", this.f102404c), m87830a(bavt, this.f102402a, this.f102403b), (bxxk) bavu.f101935d.mo74142c(7)));
    }

    /* renamed from: a */
    public final bqgg mo56080a(bavt bavt, bavu bavu) {
        return bqga.m112775a(Boolean.valueOf(bbfh.m87935a(bbfh.m87928a(this.f102402a, "gms_icing_mdd_shared_files", this.f102404c), m87830a(bavt, this.f102402a, this.f102403b), bavu)));
    }
}
