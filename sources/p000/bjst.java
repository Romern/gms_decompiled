package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.clientlog.TimedEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONStringer;

/* renamed from: bjst */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjst {

    /* renamed from: a */
    public static final C1223np f123254a = new C1223np();

    /* renamed from: b */
    final awfj f123255b;

    /* renamed from: c */
    private final Session f123256c;

    private bjst(awfj awfj, Session session) {
        this.f123255b = awfj;
        this.f123256c = session;
    }

    /* renamed from: a */
    private static bxvd m104510a(String str) {
        return m104511a(str, bjsu.m104539b());
    }

    /* renamed from: b */
    public static void m104530b(LogContext logContext) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to log endContext() with a null context");
        } else if (logContext.mo71781a()) {
            throw new IllegalArgumentException("Session contexts should be ended by calling endSession()");
        } else if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log endContext() in an invalid session.");
        } else if (logContext.f151798f) {
            String valueOf = String.valueOf(logContext);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
            sb.append("Tried to log endContext() with a context that has already ended: ");
            sb.append(valueOf);
            Log.e("ClientLog", sb.toString());
        } else {
            m104531b(logContext, 1, 0);
        }
    }

    /* renamed from: c */
    public static void m104535c(LogContext logContext) {
        bxvd bxvd;
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log resumeContext() in an invalid session.");
        } else if (logContext.f151798f) {
            LogContext logContext2 = logContext.f151794b;
            if (logContext2 == null) {
                bxvd = m104510a(logContext.mo71783b().f151801a);
            } else {
                bxvd = m104537e(logContext2);
            }
            int i = logContext.f151797e;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwfr bwfr = (bwfr) bxvd.f164949b;
            bwfr bwfr2 = bwfr.f159113m;
            bwfr.f159115a |= 16;
            bwfr.f159123i = i;
            bwfe bwfe = bwfe.EVENT_NAME_CONTEXT_RESUMED;
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bwfr bwfr3 = (bwfr) bxvd.f164949b;
            bwfr3.f159121g = bwfe.f159083I;
            int i2 = bwfr3.f159115a | 4;
            bwfr3.f159115a = i2;
            long j = logContext.f151796d;
            bwfr3.f159115a = i2 | 32;
            bwfr3.f159124j = j;
            m104528a(logContext.mo71783b(), (bwfr) bxvd.mo74062i());
            if (logContext.f151798f) {
                logContext.f151798f = false;
                int size = logContext.f151799g.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((bjsx) logContext.f151799g.get(i3)).mo65514c();
                }
                LogContext logContext3 = logContext.f151794b;
                if (logContext3 != null) {
                    logContext3.f151795c.add(logContext);
                }
            }
        } else {
            String valueOf = String.valueOf(logContext);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
            sb.append("Tried to log resumeContext() with a context that has not ended: ");
            sb.append(valueOf);
            Log.e("ClientLog", sb.toString());
        }
    }

    /* renamed from: d */
    public static boolean m104536d(LogContext logContext) {
        LogContext logContext2;
        return (logContext == null || logContext.mo71783b() == null || (logContext2 = logContext.f151793a) == null || logContext2.f151798f) ? false : true;
    }

    /* renamed from: e */
    public static bxvd m104537e(LogContext logContext) {
        bxvd da = bwfr.f159113m.mo74144da();
        int b = bjsu.m104539b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfr bwfr = (bwfr) da.f164949b;
        bwfr.f159115a |= 8;
        bwfr.f159122h = b;
        String str = logContext.mo71783b().f151801a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfr bwfr2 = (bwfr) da.f164949b;
        str.getClass();
        bwfr2.f159115a |= 1;
        bwfr2.f159118d = str;
        List b2 = bqcr.m112598b(logContext.mo71782a(0));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) da.f164949b;
        if (!bwfr3.f159120f.mo73666a()) {
            bwfr3.f159120f = bxvk.m124020a(bwfr3.f159120f);
        }
        bxsy.m123078a(b2, bwfr3.f159120f);
        int i = logContext.f151797e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfr bwfr4 = (bwfr) da.f164949b;
        bwfr4.f159115a |= 2;
        bwfr4.f159119e = i;
        return da;
    }

    /* renamed from: a */
    private static bxvd m104511a(String str, int i) {
        bxvd da = bwfr.f159113m.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfr bwfr = (bwfr) da.f164949b;
        int i2 = bwfr.f159115a | 8;
        bwfr.f159115a = i2;
        bwfr.f159122h = i;
        str.getClass();
        bwfr.f159115a = i2 | 1;
        bwfr.f159118d = str;
        return da;
    }

    /* renamed from: a */
    public static LogContext m104512a(long j, String str, Session session, long j2) {
        bxvd a = m104511a(session.f151801a, session.f151802b);
        bwfe bwfe = bwfe.EVENT_NAME_SESSION_START;
        if (a.f164950c) {
            a.mo74035c();
            a.f164950c = false;
        }
        bwfr bwfr = (bwfr) a.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i = bwfr.f159115a | 4;
        bwfr.f159115a = i;
        bwfr.f159115a = i | 32;
        bwfr.f159124j = j;
        if (!(str == null && j2 == 0)) {
            bxvd da = bwfw.f159149d.mo74144da();
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwfw bwfw = (bwfw) da.f164949b;
                str.getClass();
                bwfw.f159151a |= 1;
                bwfw.f159152b = str;
            }
            if (j2 != 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwfw bwfw2 = (bwfw) da.f164949b;
                bwfw2.f159151a |= 2;
                bwfw2.f159153c = elapsedRealtime;
            }
            bwfw bwfw3 = (bwfw) da.mo74062i();
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bwfr bwfr3 = (bwfr) a.f164949b;
            bwfw3.getClass();
            bwfr3.f159117c = bwfw3;
            bwfr3.f159116b = 17;
        }
        m104528a(session, (bwfr) a.mo74062i());
        bxvd a2 = m104510a(session.f151801a);
        bwfe bwfe2 = bwfe.EVENT_NAME_CONTEXT_START;
        if (a2.f164950c) {
            a2.mo74035c();
            a2.f164950c = false;
        }
        bwfr bwfr4 = (bwfr) a2.f164949b;
        bwfr4.f159121g = bwfe2.f159083I;
        int i2 = bwfr4.f159115a | 4;
        bwfr4.f159115a = i2;
        bwfr4.f159115a = i2 | 32;
        bwfr4.f159124j = j;
        bwfr bwfr5 = (bwfr) a2.mo74062i();
        m104528a(session, bwfr5);
        return new LogContext(session, j, bwfr5.f159122h);
    }

    /* renamed from: b */
    private static void m104531b(LogContext logContext, int i, int i2) {
        bxvd bxvd;
        ArrayList arrayList = new ArrayList(logContext.f151795c);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            LogContext logContext2 = (LogContext) arrayList.get(i3);
            if (!logContext2.f151798f) {
                m104530b(logContext2);
            }
        }
        if (!logContext.f151798f) {
            logContext.f151798f = true;
            int size2 = logContext.f151799g.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((bjsx) logContext.f151799g.get(i4)).mo65513b();
            }
            LogContext logContext3 = logContext.f151794b;
            if (logContext3 != null) {
                logContext3.f151795c.remove(logContext);
            }
        }
        LogContext logContext4 = logContext.f151794b;
        if (logContext4 == null) {
            bxvd = m104510a(logContext.mo71783b().f151801a);
        } else {
            bxvd = m104537e(logContext4);
        }
        int i5 = logContext.f151797e;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwfr bwfr = (bwfr) bxvd.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159115a |= 16;
        bwfr.f159123i = i5;
        bwfe bwfe = bwfe.EVENT_NAME_CONTEXT_END;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) bxvd.f164949b;
        bwfr3.f159121g = bwfe.f159083I;
        int i6 = bwfr3.f159115a | 4;
        bwfr3.f159115a = i6;
        long j = logContext.f151796d;
        int i7 = i6 | 32;
        bwfr3.f159115a = i7;
        bwfr3.f159124j = j;
        if (i2 != 0) {
            i7 |= 128;
            bwfr3.f159115a = i7;
            bwfr3.f159126l = i2;
        }
        if (i != 1) {
            bwfr3.f159125k = i - 1;
            bwfr3.f159115a = i7 | 64;
        }
        m104528a(logContext.mo71783b(), (bwfr) bxvd.mo74062i());
    }

    /* renamed from: b */
    public static void m104532b(LogContext logContext, int i, String str, long j) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log serverValidationError() in an invalid session.");
            return;
        }
        Session b = logContext.mo71783b();
        bxvd da = bwfu.f159137e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfu bwfu = (bwfu) da.f164949b;
        bwfu.f159140b = i - 1;
        bwfu.f159139a |= 1;
        if (b.f151805e && !TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfu bwfu2 = (bwfu) da.f164949b;
            str.getClass();
            bwfu2.f159139a |= 2;
            bwfu2.f159141c = str;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_FIELD_SERVER_VALIDATION_ERROR;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i2 = bwfr.f159115a | 4;
        bwfr.f159115a = i2;
        bwfr.f159115a = i2 | 32;
        bwfr.f159124j = j;
        bwfu bwfu3 = (bwfu) da.mo74062i();
        bwfu3.getClass();
        bwfr.f159117c = bwfu3;
        bwfr.f159116b = 11;
        m104528a(b, (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public static LogContext m104513a(LogContext logContext, long j) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log startContext() in an invalid session.");
            return null;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_CONTEXT_START;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i = bwfr.f159115a | 4;
        bwfr.f159115a = i;
        bwfr.f159115a = i | 32;
        bwfr.f159124j = j;
        bwfr bwfr3 = (bwfr) e.mo74062i();
        m104528a(logContext.mo71783b(), bwfr3);
        return new LogContext(logContext, j, bwfr3.f159122h);
    }

    /* renamed from: a */
    public static Session m104514a(awfj awfj, boolean z) {
        Session session = new Session(bjsu.m104538a(), bjsu.m104539b());
        session.f151803c = z;
        m104516a(awfj, session);
        return session;
    }

    /* renamed from: a */
    public static TimedEvent m104515a(LogContext logContext, int i) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log startApiRequest() in an invalid session.");
            return null;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_API_REQUEST_START;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bxvd da = bwfo.f159090h.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfo bwfo = (bwfo) da.f164949b;
        bwfo.f159093b = i - 1;
        bwfo.f159092a |= 1;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) e.f164949b;
        bwfo bwfo2 = (bwfo) da.mo74062i();
        bwfo2.getClass();
        bwfr3.f159117c = bwfo2;
        bwfr3.f159116b = 12;
        bwfr bwfr4 = (bwfr) e.mo74062i();
        m104528a(logContext.mo71783b(), bwfr4);
        return new TimedEvent(bwfr4);
    }

    /* renamed from: b */
    public static void m104533b(LogContext logContext, long j) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log click() in an invalid session.");
            return;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_CLICK;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i = bwfr.f159115a | 4;
        bwfr.f159115a = i;
        bwfr.f159115a = i | 32;
        bwfr.f159124j = j;
        m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: b */
    public static void m104534b(LogContext logContext, boolean z) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log webViewAuthTokenLoaded() in an invalid session.");
            return;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_WEB_VIEW_AUTH;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bxvd da = bwfz.f159157d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfz bwfz = (bwfz) da.f164949b;
        bwfz.f159160b = 2;
        int i = bwfz.f159159a | 1;
        bwfz.f159159a = i;
        bwfz.f159159a = 2 | i;
        bwfz.f159161c = z;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) e.f164949b;
        bwfz bwfz2 = (bwfz) da.mo74062i();
        bwfz2.getClass();
        bwfr3.f159117c = bwfz2;
        bwfr3.f159116b = 19;
        m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public static void m104516a(awfj awfj, Session session) {
        f123254a.put(session.f151801a, new bjst(awfj, session));
    }

    /* renamed from: a */
    public static void m104517a(LogContext logContext) {
        if (logContext != null) {
            f123254a.remove(logContext.mo71783b().f151801a);
        } else {
            Log.e("ClientLog", "Tried to drop ClientLog instance for a null session context.");
        }
    }

    /* renamed from: a */
    public static void m104518a(LogContext logContext, int i, int i2) {
        if (logContext == null) {
            Log.e("ClientLog", "Tried to end session with a null session context.");
        } else if (!logContext.mo71781a()) {
            throw new IllegalArgumentException("Tried to end session with non-session context.");
        } else if (!logContext.f151798f) {
            m104531b(logContext, i, i2);
            bxvd a = m104510a(logContext.mo71783b().f151801a);
            int i3 = logContext.mo71783b().f151802b;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bwfr bwfr = (bwfr) a.f164949b;
            bwfr bwfr2 = bwfr.f159113m;
            bwfr.f159115a |= 16;
            bwfr.f159123i = i3;
            bwfe bwfe = bwfe.EVENT_NAME_SESSION_END;
            if (a.f164950c) {
                a.mo74035c();
                a.f164950c = false;
            }
            bwfr bwfr3 = (bwfr) a.f164949b;
            bwfr3.f159121g = bwfe.f159083I;
            int i4 = bwfr3.f159115a | 4;
            bwfr3.f159115a = i4;
            long j = logContext.f151796d;
            int i5 = i4 | 32;
            bwfr3.f159115a = i5;
            bwfr3.f159124j = j;
            bwfr3.f159125k = i - 1;
            int i6 = i5 | 64;
            bwfr3.f159115a = i6;
            if (i2 != 0) {
                bwfr3.f159115a = i6 | 128;
                bwfr3.f159126l = i2;
            }
            m104528a(logContext.mo71783b(), (bwfr) a.mo74062i());
        } else {
            String valueOf = String.valueOf(logContext.mo71783b().f151801a);
            Log.e("ClientLog", valueOf.length() == 0 ? new String("Tried to end session that has already ended: ") : "Tried to end session that has already ended: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public static void m104519a(LogContext logContext, int i, String str, long j) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log clientValidationError() in an invalid session.");
            return;
        }
        Session b = logContext.mo71783b();
        bxvd da = bwfu.f159137e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfu bwfu = (bwfu) da.f164949b;
        bwfu.f159140b = i - 1;
        bwfu.f159139a |= 1;
        if (b.f151805e && !TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfu bwfu2 = (bwfu) da.f164949b;
            str.getClass();
            bwfu2.f159139a |= 2;
            bwfu2.f159141c = str;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_FIELD_CLIENT_VALIDATION_ERROR;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i2 = bwfr.f159115a | 4;
        bwfr.f159115a = i2;
        bwfr.f159115a = i2 | 32;
        bwfr.f159124j = j;
        bwfu bwfu3 = (bwfu) da.mo74062i();
        bwfu3.getClass();
        bwfr.f159117c = bwfu3;
        bwfr.f159116b = 11;
        m104528a(b, (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public static void m104520a(LogContext logContext, int i, List list, boolean z) {
        if (logContext != null) {
            if (i == 1) {
                i = 3;
            }
            Session b = logContext.mo71783b();
            int i2 = b.f151806f;
            if (i2 == 1) {
                b.f151806f = i;
                b.f151804d = list;
                b.f151805e = z;
            } else if (i2 != i) {
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                int i3 = b.f151806f;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    objArr[0] = Integer.valueOf(i4);
                    objArr[1] = Integer.valueOf(i - 1);
                    Log.w("ClientLog", String.format(locale, "setLogLevel unsuccessful (tried to change from %s to %s during a session)", objArr));
                    return;
                }
                throw null;
            } else if (i2 == 7 && !list.equals(b.f151804d)) {
                Log.w("ClientLog", "setLogLevel unsuccessful (tried to change event list during a session)");
            } else if (b.f151805e != z) {
                Log.w("ClientLog", "setLogLevel unsuccessful (tried to change identifiers flag during a session)");
            }
        } else {
            Log.e("ClientLog", "setLogLevel unsuccessful (null log context)");
        }
    }

    /* renamed from: a */
    public static void m104521a(LogContext logContext, long j, int i) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log fingerprintAuth() in an invalid session.");
            return;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_FINGERPRINT_AUTH;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        int i2 = bwfr.f159115a | 4;
        bwfr.f159115a = i2;
        bwfr.f159115a = i2 | 32;
        bwfr.f159124j = j;
        bxvd da = bwfs.f159127c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfs bwfs = (bwfs) da.f164949b;
        bwfs.f159130b = i - 1;
        bwfs.f159129a |= 1;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) e.f164949b;
        bwfs bwfs2 = (bwfs) da.mo74062i();
        bwfs2.getClass();
        bwfr3.f159117c = bwfs2;
        bwfr3.f159116b = 20;
        m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public static void m104522a(LogContext logContext, TimedEvent timedEvent) {
        bwfu bwfu;
        bwfu bwfu2;
        bwfu bwfu3;
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endFocused() with a null startEvent.");
        } else if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log endFocused() in an invalid session.");
        } else {
            bxvd da = bwfu.f159137e.mo74144da();
            bwfr bwfr = timedEvent.f151807a;
            if (bwfr.f159116b == 11) {
                bwfu = (bwfu) bwfr.f159117c;
            } else {
                bwfu = bwfu.f159137e;
            }
            int a = bwfh.m121907a(bwfu.f159140b);
            if (a == 0) {
                a = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfu bwfu4 = (bwfu) da.f164949b;
            bwfu4.f159140b = a - 1;
            bwfu4.f159139a |= 1;
            bwfr bwfr2 = timedEvent.f151807a;
            if (bwfr2.f159116b == 11) {
                bwfu2 = (bwfu) bwfr2.f159117c;
            } else {
                bwfu2 = bwfu.f159137e;
            }
            if ((bwfu2.f159139a & 2) != 0) {
                bwfr bwfr3 = timedEvent.f151807a;
                if (bwfr3.f159116b == 11) {
                    bwfu3 = (bwfu) bwfr3.f159117c;
                } else {
                    bwfu3 = bwfu.f159137e;
                }
                String str = bwfu3.f159141c;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwfu bwfu5 = (bwfu) da.f164949b;
                str.getClass();
                bwfu5.f159139a |= 2;
                bwfu5.f159141c = str;
            }
            bxvd e = m104537e(logContext);
            int i = timedEvent.f151807a.f159122h;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr4 = (bwfr) e.f164949b;
            bwfr bwfr5 = bwfr.f159113m;
            bwfr4.f159115a |= 16;
            bwfr4.f159123i = i;
            bwfe bwfe = bwfe.EVENT_NAME_FIELD_FOCUSED_END;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr6 = (bwfr) e.f164949b;
            bwfr6.f159121g = bwfe.f159083I;
            int i2 = bwfr6.f159115a | 4;
            bwfr6.f159115a = i2;
            long j = timedEvent.f151807a.f159124j;
            bwfr6.f159115a = i2 | 32;
            bwfr6.f159124j = j;
            bwfu bwfu6 = (bwfu) da.mo74062i();
            bwfu6.getClass();
            bwfr6.f159117c = bwfu6;
            bwfr6.f159116b = 11;
            m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m104523a(LogContext logContext, TimedEvent timedEvent, int i) {
        bwfp bwfp;
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endAppValidation() with a null startEvent.");
        } else if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log endAppValidation() in an invalid session.");
        } else {
            bxvd e = m104537e(logContext);
            int i2 = timedEvent.f151807a.f159122h;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr = (bwfr) e.f164949b;
            bwfr bwfr2 = bwfr.f159113m;
            bwfr.f159115a |= 16;
            bwfr.f159123i = i2;
            bwfe bwfe = bwfe.EVENT_NAME_APP_VALIDATION_END;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr3 = (bwfr) e.f164949b;
            bwfr3.f159121g = bwfe.f159083I;
            bwfr3.f159115a |= 4;
            bxvd da = bwfp.f159099c.mo74144da();
            bwfr bwfr4 = timedEvent.f151807a;
            if (bwfr4.f159116b == 14) {
                bwfp = (bwfp) bwfr4.f159117c;
            } else {
                bwfp = bwfp.f159099c;
            }
            String str = bwfp.f159102b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfp bwfp2 = (bwfp) da.f164949b;
            str.getClass();
            bwfp2.f159101a |= 1;
            bwfp2.f159102b = str;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr5 = (bwfr) e.f164949b;
            bwfp bwfp3 = (bwfp) da.mo74062i();
            bwfp3.getClass();
            bwfr5.f159117c = bwfp3;
            bwfr5.f159116b = 14;
            if (i != 0) {
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr6 = (bwfr) e.f164949b;
                bwfr6.f159125k = 5;
                int i3 = bwfr6.f159115a | 64;
                bwfr6.f159115a = i3;
                bwfr6.f159115a = i3 | 128;
                bwfr6.f159126l = i;
            } else {
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr7 = (bwfr) e.f164949b;
                bwfr7.f159125k = 1;
                bwfr7.f159115a |= 64;
            }
            m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m104524a(LogContext logContext, TimedEvent timedEvent, int i, int i2, bmaq bmaq, List list, int i3) {
        bwfo bwfo;
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endApiRequest() with a null startEvent.");
        } else if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log endApiRequest() in an invalid session.");
        } else {
            bxvd da = bwfo.f159090h.mo74144da();
            bwfr bwfr = timedEvent.f151807a;
            if (bwfr.f159116b == 12) {
                bwfo = (bwfo) bwfr.f159117c;
            } else {
                bwfo = bwfo.f159090h;
            }
            int a = bwfa.m121898a(bwfo.f159093b);
            if (a == 0) {
                a = 1;
            }
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfo bwfo2 = (bwfo) da.f164949b;
            bwfo2.f159093b = a - 1;
            int i4 = bwfo2.f159092a | 1;
            bwfo2.f159092a = i4;
            int i5 = i3 - 1;
            if (i3 != 0) {
                bwfo2.f159098g = i5;
                int i6 = i4 | 8;
                bwfo2.f159092a = i6;
                if (bmaq != null) {
                    long j = bmaq.f128482b;
                    int i7 = i6 | 2;
                    bwfo2.f159092a = i7;
                    bwfo2.f159094c = j;
                    bxtx bxtx = bmaq.f128484d;
                    bxtx.getClass();
                    bwfo2.f159092a = i7 | 4;
                    bwfo2.f159095d = bxtx;
                    for (bmap bmap : new bxvv(bmaq.f128486f, bmaq.f128477g)) {
                        int i8 = bmap.f128476h;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwfo bwfo3 = (bwfo) da.f164949b;
                        if (!bwfo3.f159096e.mo73666a()) {
                            bwfo3.f159096e = bxvk.m124019a(bwfo3.f159096e);
                        }
                        bwfo3.f159096e.mo74153d(i8);
                    }
                }
                if (list != null) {
                    int size = list.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        int intValue = ((Integer) list.get(i9)).intValue();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bwfo bwfo4 = (bwfo) da.f164949b;
                        if (!bwfo4.f159097f.mo73666a()) {
                            bwfo4.f159097f = bxvk.m124019a(bwfo4.f159097f);
                        }
                        bwfo4.f159097f.mo74153d(intValue);
                    }
                }
                bxvd e = m104537e(logContext);
                int i10 = timedEvent.f151807a.f159122h;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr2 = (bwfr) e.f164949b;
                bwfr bwfr3 = bwfr.f159113m;
                bwfr2.f159115a |= 16;
                bwfr2.f159123i = i10;
                bwfe bwfe = bwfe.EVENT_NAME_API_REQUEST_END;
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr4 = (bwfr) e.f164949b;
                bwfr4.f159121g = bwfe.f159083I;
                int i11 = bwfr4.f159115a | 4;
                bwfr4.f159115a = i11;
                bwfr4.f159125k = i - 1;
                int i12 = i11 | 64;
                bwfr4.f159115a = i12;
                bwfr4.f159115a = i12 | 128;
                bwfr4.f159126l = i2;
                bwfo bwfo5 = (bwfo) da.mo74062i();
                bwfo5.getClass();
                bwfr4.f159117c = bwfo5;
                bwfr4.f159116b = 12;
                m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public static void m104525a(LogContext logContext, TimedEvent timedEvent, boolean z, int i, int i2, String str) {
        bwga bwga;
        if (timedEvent == null) {
            Log.e("ClientLog", "Tried to log endWebViewPageLoad() with a null startEvent.");
        } else if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log endWebViewPageLoad() in an invalid session.");
        } else {
            bxvd da = bwga.f159162f.mo74144da();
            bwfr bwfr = timedEvent.f151807a;
            if (bwfr.f159116b == 13) {
                bwga = (bwga) bwfr.f159117c;
            } else {
                bwga = bwga.f159162f;
            }
            String str2 = bwga.f159165b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwga bwga2 = (bwga) da.f164949b;
            str2.getClass();
            int i3 = bwga2.f159164a | 1;
            bwga2.f159164a = i3;
            bwga2.f159165b = str2;
            int i4 = i3 | 2;
            bwga2.f159164a = i4;
            bwga2.f159166c = z;
            bwga2.f159164a = i4 | 4;
            bwga2.f159167d = i2;
            if (!TextUtils.isEmpty(str)) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bwga bwga3 = (bwga) da.f164949b;
                str.getClass();
                bwga3.f159164a |= 8;
                bwga3.f159168e = str;
            }
            bxvd e = m104537e(logContext);
            int i5 = timedEvent.f151807a.f159122h;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr2 = (bwfr) e.f164949b;
            bwfr bwfr3 = bwfr.f159113m;
            bwfr2.f159115a |= 16;
            bwfr2.f159123i = i5;
            bwfe bwfe = bwfe.EVENT_NAME_WEB_VIEW_PAGE_LOAD_END;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr4 = (bwfr) e.f164949b;
            bwfr4.f159121g = bwfe.f159083I;
            bwfr4.f159115a |= 4;
            bwga bwga4 = (bwga) da.mo74062i();
            bwga4.getClass();
            bwfr4.f159117c = bwga4;
            bwfr4.f159116b = 13;
            if (i != 0) {
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr5 = (bwfr) e.f164949b;
                bwfr5.f159125k = 5;
                int i6 = bwfr5.f159115a | 64;
                bwfr5.f159115a = i6;
                bwfr5.f159115a = i6 | 128;
                bwfr5.f159126l = i;
            } else {
                if (e.f164950c) {
                    e.mo74035c();
                    e.f164950c = false;
                }
                bwfr bwfr6 = (bwfr) e.f164949b;
                bwfr6.f159125k = 1;
                bwfr6.f159115a |= 64;
            }
            m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
        }
    }

    /* renamed from: a */
    public static void m104526a(LogContext logContext, String str, long j, int i, int i2) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log editTextValueChanged() in an invalid session.");
            return;
        }
        Session b = logContext.mo71783b();
        bxvd da = bwfu.f159137e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfu bwfu = (bwfu) da.f164949b;
        bwfu.f159140b = 1;
        bwfu.f159139a |= 1;
        if (b.f151805e && !TextUtils.isEmpty(str)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfu bwfu2 = (bwfu) da.f164949b;
            str.getClass();
            bwfu2.f159139a |= 2;
            bwfu2.f159141c = str;
        }
        bxvd da2 = bwft.f159131e.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bwft bwft = (bwft) da2.f164949b;
        int i3 = i - 1;
        if (i != 0) {
            bwft.f159136d = i3;
            bwft.f159133a |= 1;
            bwft.f159134b = 4;
            bwft.f159135c = Integer.valueOf(i2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bwfu bwfu3 = (bwfu) da.f164949b;
            bwft bwft2 = (bwft) da2.mo74062i();
            bwft2.getClass();
            bwfu3.f159142d = bwft2;
            bwfu3.f159139a |= 4;
            bxvd e = m104537e(logContext);
            bwfe bwfe = bwfe.EVENT_NAME_FIELD_VALUE_CHANGED;
            if (e.f164950c) {
                e.mo74035c();
                e.f164950c = false;
            }
            bwfr bwfr = (bwfr) e.f164949b;
            bwfr bwfr2 = bwfr.f159113m;
            bwfr.f159121g = bwfe.f159083I;
            int i4 = bwfr.f159115a | 4;
            bwfr.f159115a = i4;
            bwfr.f159115a = i4 | 32;
            bwfr.f159124j = j;
            bwfu bwfu4 = (bwfu) da.mo74062i();
            bwfu4.getClass();
            bwfr.f159117c = bwfu4;
            bwfr.f159116b = 11;
            m104528a(b, (bwfr) e.mo74062i());
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public static void m104527a(LogContext logContext, boolean z) {
        if (!m104536d(logContext)) {
            Log.e("ClientLog", "Tried to log webViewAuthLoginUrlGenerated() in an invalid session.");
            return;
        }
        bxvd e = m104537e(logContext);
        bwfe bwfe = bwfe.EVENT_NAME_WEB_VIEW_AUTH;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bxvd da = bwfz.f159157d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bwfz bwfz = (bwfz) da.f164949b;
        bwfz.f159160b = 1;
        int i = 1 | bwfz.f159159a;
        bwfz.f159159a = i;
        bwfz.f159159a = i | 2;
        bwfz.f159161c = z;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr3 = (bwfr) e.f164949b;
        bwfz bwfz2 = (bwfz) da.mo74062i();
        bwfz2.getClass();
        bwfr3.f159117c = bwfz2;
        bwfr3.f159116b = 19;
        m104528a(logContext.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    public static void m104528a(Session session, bwfr bwfr) {
        bwfe bwfe;
        bwfu bwfu;
        bwfu bwfu2;
        bwfu bwfu3;
        bwfu bwfu4;
        bjst bjst = (bjst) f123254a.get(session.f151801a);
        if (bjst != null) {
            bwfe a = bwfe.m121902a(bwfr.f159121g);
            if (a == null) {
                a = bwfe.EVENT_NAME_UNKNOWN;
            }
            if (a == bwfe.EVENT_NAME_UNKNOWN) {
                Log.e("ClientLog", "Could not log invalid event with name EVENT_NAME_UNKNOWN");
                return;
            }
            Session session2 = bjst.f123256c;
            if (session2.f151803c) {
                bwfe a2 = bwfe.m121902a(bwfr.f159121g);
                if (a2 == null) {
                    a2 = bwfe.EVENT_NAME_UNKNOWN;
                }
                if (m104529a(session2, a2)) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(System.currentTimeMillis());
                    JSONStringer jSONStringer = new JSONStringer();
                    try {
                        jSONStringer.object().key("session_id").value(bwfr.f159118d).key("context_start_event_id").value((long) bwfr.f159119e).key("context_ui_reference").array();
                        for (Long l : bwfr.f159120f) {
                            jSONStringer.value(l.longValue());
                        }
                        JSONStringer key = jSONStringer.endArray().key("name");
                        bwfe a3 = bwfe.m121902a(bwfr.f159121g);
                        if (a3 == null) {
                            a3 = bwfe.EVENT_NAME_UNKNOWN;
                        }
                        JSONStringer key2 = key.value((long) a3.f159083I).key("event_id").value((long) bwfr.f159122h).key("timed_start_event_id").value((long) bwfr.f159123i).key("ui_reference").value(bwfr.f159124j).key("result");
                        int a4 = bwfl.m121911a(bwfr.f159125k);
                        if (a4 == 0) {
                            a4 = 1;
                        }
                        key2.value((long) (a4 - 1)).key("result_code").value((long) bwfr.f159126l).key("form_field_data");
                        if (bwfr.f159116b == 11) {
                            JSONStringer key3 = jSONStringer.object().key("field_type");
                            if (bwfr.f159116b == 11) {
                                bwfu = (bwfu) bwfr.f159117c;
                            } else {
                                bwfu = bwfu.f159137e;
                            }
                            int a5 = bwfh.m121907a(bwfu.f159140b);
                            if (a5 == 0) {
                                a5 = 1;
                            }
                            JSONStringer key4 = key3.value((long) (a5 - 1)).key("field_name");
                            if (bwfr.f159116b == 11) {
                                bwfu2 = (bwfu) bwfr.f159117c;
                            } else {
                                bwfu2 = bwfu.f159137e;
                            }
                            key4.value(bwfu2.f159141c).key("form_field_value_info");
                            if (bwfr.f159116b == 11) {
                                bwfu3 = (bwfu) bwfr.f159117c;
                            } else {
                                bwfu3 = bwfu.f159137e;
                            }
                            if ((bwfu3.f159139a & 4) != 0) {
                                if (bwfr.f159116b == 11) {
                                    bwfu4 = (bwfu) bwfr.f159117c;
                                } else {
                                    bwfu4 = bwfu.f159137e;
                                }
                                bwft bwft = bwfu4.f159142d;
                                if (bwft == null) {
                                    bwft = bwft.f159131e;
                                }
                                JSONStringer key5 = jSONStringer.object().key("entry_method");
                                int a6 = bwfc.m121900a(bwft.f159136d);
                                if (a6 == 0) {
                                    a6 = 1;
                                }
                                key5.value((long) (a6 - 1)).key("selected_position").value((long) (bwft.f159134b == 2 ? ((Integer) bwft.f159135c).intValue() : 0)).key("checked").value(bwft.f159134b == 3 ? ((Boolean) bwft.f159135c).booleanValue() : false).key("num_characters").value((long) (bwft.f159134b == 4 ? ((Integer) bwft.f159135c).intValue() : 0)).key("percent_filled").value((long) (bwft.f159134b == 5 ? ((Integer) bwft.f159135c).intValue() : 0)).endObject();
                            } else {
                                jSONStringer.value((Object) null);
                            }
                            jSONStringer.endObject();
                        } else {
                            jSONStringer.value((Object) null);
                        }
                        jSONStringer.endObject();
                    } catch (JSONException e) {
                        Log.e("MEGALOG", "Json error", e);
                    }
                    objArr[1] = jSONStringer.toString();
                    awfj awfj = bjst.f123255b;
                    if (awfj == null) {
                        return;
                    }
                    if (awfj.f94273d) {
                        ArrayList arrayList = awfj.f94271b;
                        byte[] bArr = awfj.f94272c;
                        bxvd da = bxbd.f161778h.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bxbd bxbd = (bxbd) da.f164949b;
                        bxbd.f161781b = 782;
                        int i = 1 | bxbd.f161780a;
                        bxbd.f161780a = i;
                        bwfr.getClass();
                        bxbd.f161786g = bwfr;
                        int i2 = i | 32;
                        bxbd.f161780a = i2;
                        int i3 = i2 | 2;
                        bxbd.f161780a = i3;
                        bxbd.f161782c = -1;
                        int i4 = i3 | 16;
                        bxbd.f161780a = i4;
                        bxbd.f161785f = -1;
                        bxbd.f161780a = i4 | 8;
                        bxbd.f161784e = -1;
                        if (bArr != null) {
                            bxtx a7 = bxtx.m123261a(bArr);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bxbd bxbd2 = (bxbd) da.f164949b;
                            a7.getClass();
                            bxbd2.f161780a |= 4;
                            bxbd2.f161783d = a7;
                        }
                        arrayList.add((bxbd) da.mo74062i());
                        return;
                    }
                    qwo a8 = awfj.f94270a.mo24334a(new awfi(bwfr));
                    a8.mo24326a(awfx.m79882a());
                    a8.mo24327b();
                    return;
                }
                return;
            }
            return;
        }
        if (bwfr != null) {
            bwfe = bwfe.m121902a(bwfr.f159121g);
            if (bwfe == null) {
                bwfe = bwfe.EVENT_NAME_UNKNOWN;
            }
        } else {
            bwfe = bwfe.EVENT_NAME_UNKNOWN;
        }
        Log.e("ClientLog", String.format(Locale.US, "Logger not initialized for eventName=%s. Must call initLogger before logging.", Integer.valueOf(bwfe.f159083I)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r3.contains(r0) != false) goto L_0x004d;
     */
    /* renamed from: a */
    public static boolean m104529a(Session session, bwfe bwfe) {
        bwfe bwfe2;
        int i = session.f151806f;
        if (i == 0) {
            i = 1;
        }
        List list = session.f151804d;
        bwfe bwfe3 = bwfe.EVENT_NAME_UNKNOWN;
        int i2 = i - 1;
        if (!(i2 == 0 || i2 == 5)) {
            if (i2 == 6) {
                int ordinal = bwfe.ordinal();
                if (ordinal != 7) {
                    bwfe2 = ordinal != 9 ? bwfe : bwfe.EVENT_NAME_EXPANDED_START;
                } else {
                    bwfe2 = bwfe.EVENT_NAME_FIELD_FOCUSED_START;
                }
            }
            if (bwfe == bwfe.EVENT_NAME_SESSION_START || bwfe == bwfe.EVENT_NAME_SESSION_END || bwfe == bwfe.EVENT_NAME_CONTEXT_START || bwfe == bwfe.EVENT_NAME_CONTEXT_RESUMED || bwfe == bwfe.EVENT_NAME_CONTEXT_END || bwfe == bwfe.EVENT_NAME_API_REQUEST_START || bwfe == bwfe.EVENT_NAME_API_REQUEST_END) {
                return true;
            }
            return false;
        }
        return true;
    }
}
