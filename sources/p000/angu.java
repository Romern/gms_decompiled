package p000;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: angu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class angu extends aaab {

    /* renamed from: a */
    private static final srn f76816a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private final caif f76817b;

    /* renamed from: c */
    private final boolean f76818c;

    public angu(String str, caif caif) {
        this(str, caif, true);
    }

    /* renamed from: a */
    private final void m64346a(Context context, long j, Exception exc) {
        bxvd a = anfd.m64145a(context);
        cahp a2 = mo41825a();
        if (a2 != null) {
            bxvd bxvd = (bxvd) a2.mo74142c(5);
            bxvd.mo73625a((bxvk) a2);
            caho caho = (caho) bxvd;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
            if (caho.f164950c) {
                caho.mo74035c();
                caho.f164950c = false;
            }
            cahp cahp = (cahp) caho.f164949b;
            cahp.f174574a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            cahp.f174585l = elapsedRealtime;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            caig caig = (caig) a.f164949b;
            cahp cahp2 = (cahp) caho.mo74062i();
            caig caig2 = caig.f174681k;
            cahp2.getClass();
            caig.f174685c = cahp2;
            caig.f174683a |= 2;
        }
        cahp[] b = mo41829b();
        if (b != null) {
            List asList = Arrays.asList(b);
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            caig caig3 = (caig) a.f164949b;
            caig caig4 = caig.f174681k;
            if (!caig3.f174686d.mo73666a()) {
                caig3.f174686d = bxvk.m124021a(caig3.f174686d);
            }
            bxsy.m123078a(asList, caig3.f174686d);
        }
        List d = mo41831d();
        if (d != null && !d.isEmpty()) {
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            caig caig5 = (caig) a.f164949b;
            caig caig6 = caig.f174681k;
            caig5.mo74651c();
            bxsy.m123078a(d, caig5.f174692j);
        }
        cahz c = mo41830c();
        if (c != null) {
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            caig caig7 = (caig) a.f164949b;
            caig caig8 = caig.f174681k;
            c.getClass();
            caig7.f174689g = c;
            caig7.f174683a |= 32;
        }
        if (exc != null) {
            bxvd da = caie.f174634d.mo74144da();
            String name = exc.getClass().getName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            caie caie = (caie) da.f164949b;
            name.getClass();
            int i = caie.f174636a | 1;
            caie.f174636a = i;
            caie.f174637b = name;
            if (exc instanceof anfy) {
                int i2 = ((anfy) exc).f76792a;
                caie.f174636a = i | 2;
                caie.f174638c = i2;
            }
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            caig caig9 = (caig) a.f164949b;
            caie caie2 = (caie) da.mo74062i();
            caig caig10 = caig.f174681k;
            caie2.getClass();
            caig9.f174687e = caie2;
            caig9.f174683a |= 8;
            bnsl bnsl = (bnsl) f76816a.mo68387b();
            bnsl.mo68437a(exc);
            bnsl.mo68432a("angu", "a", (int) BaseMfiEventCallback.TYPE_ISSUE_LIMIT_EXCEEDED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("Phenotype API error. Event %s, EventCode: %s", a.mo74062i(), this.f76817b);
        } else {
            a.mo74062i();
        }
        qwo a3 = anfd.m64146a().mo24335a(((caig) a.mo74062i()).mo73642k());
        a3.mo24328b(this.f76817b.f174680O);
        a3.mo24327b();
    }

    /* renamed from: a */
    public abstract cahp mo41825a();

    /* renamed from: b */
    public abstract void mo41827b(Context context);

    /* renamed from: b */
    public abstract void mo41828b(Context context, anfw anfw);

    /* renamed from: b */
    public cahp[] mo41829b() {
        return null;
    }

    /* renamed from: c */
    public cahz mo41830c() {
        return null;
    }

    /* renamed from: d */
    public List mo41831d() {
        return null;
    }

    public angu(String str, caif caif, boolean z) {
        super(51, str);
        this.f76817b = caif;
        this.f76818c = z;
    }

    /* renamed from: a */
    public static void m64347a(Context context, String str, SQLiteException sQLiteException) {
        bxvd a = anfd.m64145a(context);
        bxvd da = caih.f174693f.mo74144da();
        String name = sQLiteException.getClass().getName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caih caih = (caih) da.f164949b;
        name.getClass();
        int i = caih.f174695a | 1;
        caih.f174695a = i;
        caih.f174696b = name;
        str.getClass();
        caih.f174695a = i | 2;
        caih.f174697c = str;
        String message = sQLiteException.getMessage();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caih caih2 = (caih) da.f164949b;
        message.getClass();
        caih2.f174695a |= 4;
        caih2.f174698d = message;
        StringBuilder sb = new StringBuilder();
        if (anhe.m64383a()) {
            anfg b = anfg.m64153b(context);
            try {
                sb.append("Device-encrypted:");
                sb.append(anfw.m64184b(b.getWritableDatabase()));
                sb.append("\n");
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) f76816a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("angu", "a", 242, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Phenotype deDatabase integrity check failed");
            } catch (Throwable th) {
                b.close();
                throw th;
            }
            b.close();
        }
        if (aytw.m84815b(context)) {
            anfg a2 = anfg.m64152a(context);
            try {
                sb.append("Credential-encrypted:");
                sb.append(anfw.m64184b(a2.getWritableDatabase()));
            } catch (SQLiteException e2) {
                bnsl bnsl2 = (bnsl) f76816a.mo68387b();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("angu", "a", 255, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Phenotype ceDatabase integrity check failed");
            } catch (Throwable th2) {
                a2.close();
                throw th2;
            }
            a2.close();
        }
        String sb2 = sb.toString();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caih caih3 = (caih) da.f164949b;
        sb2.getClass();
        caih3.f174695a |= 8;
        caih3.f174699e = sb2;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        caig caig = (caig) a.f164949b;
        caih caih4 = (caih) da.mo74062i();
        caig caig2 = caig.f174681k;
        caih4.getClass();
        caig.f174688f = caih4;
        caig.f174683a |= 16;
        qwo a3 = anfd.m64146a().mo24335a(((caig) a.mo74062i()).mo73642k());
        a3.mo24328b(31);
        a3.mo24327b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056  */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        Throwable th;
        if (!cgcv.f186578a.mo6606a().mo83502a()) {
            anfg a = anfg.m64152a(context);
            try {
                mo41826a(context, a);
            } finally {
                a.close();
            }
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!aytw.m84813a(context)) {
                Exception e = null;
                try {
                    mo41827b(context);
                    if (this.f76818c) {
                        m64346a(context, elapsedRealtime, (Exception) null);
                    }
                } catch (IOException e2) {
                    throw new aaaj(29511, "Operation failed", null, e2);
                } catch (anfy e3) {
                    throw new aaaj(e3.f76792a, e3.f76793b);
                } catch (RuntimeException e4) {
                    e = e4;
                    throw e;
                } catch (Throwable th2) {
                    th = th2;
                    e = e2;
                    if (this.f76818c) {
                    }
                    throw th;
                }
            } else {
                throw new aaaj(29508, "API access is not supported in direct boot mode.");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* renamed from: a */
    public final void mo41826a(Context context, anfw anfw) {
        Throwable th;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!aytw.m84813a(context)) {
            RuntimeException e = null;
            try {
                mo41828b(context, anfw);
                if (this.f76818c) {
                    m64346a(context, elapsedRealtime, (Exception) null);
                }
            } catch (SQLiteException e2) {
                if (this.f76818c) {
                    m64347a(context, getClass().getName(), e2);
                }
                mo6503a(Status.f30109c);
                if (this.f76818c) {
                    m64346a(context, elapsedRealtime, e2);
                }
            } catch (anfx e3) {
                throw new aaaj(e3.f76790a, e3.f76791b);
            } catch (anfy e4) {
                throw new aaaj(e4.f76792a, e4.f76793b);
            } catch (RuntimeException e5) {
                e = e5;
                throw e;
            } catch (Throwable th2) {
                e = e2;
                th = th2;
                if (this.f76818c) {
                }
                throw th;
            }
        } else {
            throw new aaaj(29508, "API access is not supported in direct boot mode.");
        }
    }
}
