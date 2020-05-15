package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.debug.ModuleSetJournalUpdate$ModuleSetJournalIntentOperation;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: qox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qox {

    /* renamed from: a */
    public final C1245ok f41905a = new C1245ok();

    /* renamed from: b */
    private boolean f41906b = false;

    /* renamed from: a */
    public static String m32595a(String str, long j) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append(str);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo24185b() {
        this.f41906b = true;
    }

    /* renamed from: a */
    public static String m32596a(qov qov) {
        return m32595a(qov.f41900b, qov.f41901c);
    }

    /* renamed from: a */
    public static void m32597a(bxvd bxvd) {
        if (((qov) bxvd.f164949b).f41902d.size() > 10) {
            List unmodifiableList = Collections.unmodifiableList(((qov) bxvd.f164949b).f41902d);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            qov qov = qov.f41897f;
            ((qov) bxvd.f164949b).f41902d = GeneratedMessageLite.m124030de();
            bxvd.mo73943F(unmodifiableList.subList(0, 10));
        }
    }

    /* renamed from: a */
    public final void mo24179a(Context context) {
        byte[] a = mo24184a();
        boolean z = this.f41906b;
        Intent startIntent = IntentOperation.getStartIntent(context, ModuleSetJournalUpdate$ModuleSetJournalIntentOperation.class, "com.google.android.gms.chimera.debug.WRITE_JOURNAL_UPDATE_ACTION");
        if (startIntent != null) {
            startIntent.putExtra("entries", a);
            startIntent.putExtra("isComprehensive", z ? 1 : 0);
        } else {
            startIntent = null;
        }
        if (startIntent != null) {
            context.startService(startIntent);
        }
    }

    /* renamed from: a */
    public final void mo24180a(bojy bojy, int i) {
        mo24181a(bojy.f133370b, bojy.f133373e, i);
    }

    /* renamed from: a */
    public final void mo24181a(String str, long j, int i) {
        bxvd da = qov.f41897f.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qov qov = (qov) da.f164949b;
        str.getClass();
        int i2 = qov.f41899a | 1;
        qov.f41899a = i2;
        qov.f41900b = str;
        qov.f41899a = i2 | 2;
        qov.f41901c = j;
        long longValue = Long.valueOf(System.currentTimeMillis()).longValue();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qov qov2 = (qov) da.f164949b;
        qov2.f41899a |= 4;
        qov2.f41903e = longValue;
        bxvd da2 = qou.f41893c.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qou qou = (qou) da2.f164949b;
        qou.f41896b = i - 1;
        qou.f41895a |= 1;
        da.mo74069j(da2);
        String a = m32595a(str, j);
        int a2 = this.f41905a.mo15616a(a);
        if (a2 >= 0) {
            da.mo73943F(((qov) this.f41905a.mo15621c(a2)).f41902d);
        }
        m32597a(da);
        this.f41905a.put(a, (qov) da.mo74062i());
    }

    /* renamed from: a */
    public final void mo24182a(List list, int i) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo24180a((bojy) it.next(), i);
            }
        }
    }

    /* renamed from: a */
    public final void mo24183a(qmk qmk, int i) {
        if (qmk != null) {
            mo24182a(qmk.f41707a, i);
        }
    }

    /* renamed from: a */
    public final byte[] mo24184a() {
        bxvd da = qor.f41889b.mo74144da();
        int i = 0;
        while (true) {
            C1245ok okVar = this.f41905a;
            if (i >= okVar.f26809h) {
                return ((qor) da.mo74062i()).serializeToBytes();
            }
            qov qov = (qov) okVar.mo15621c(i);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qor qor = (qor) da.f164949b;
            qov.getClass();
            qor.mo24176a();
            qor.f41891a.add(qov);
            i++;
        }
    }
}
