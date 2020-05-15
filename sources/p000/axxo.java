package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: axxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axxo extends axxl {

    /* renamed from: a */
    final /* synthetic */ axxv f96662a;

    /* renamed from: b */
    private final axue f96663b;

    /* renamed from: c */
    private final String f96664c;

    /* renamed from: d */
    private final String f96665d;

    /* renamed from: e */
    private final boolean f96666e;

    /* renamed from: f */
    private int f96667f;

    /* renamed from: g */
    private ArrayList f96668g;

    /* renamed from: h */
    private boolean f96669h;

    public axxo(axxv axxv, axue axue, String str, String str2, boolean z) {
        this.f96662a = axxv;
        sdo.m34959a(axue);
        this.f96663b = axue;
        this.f96664c = str;
        this.f96665d = str2;
        this.f96666e = z;
    }

    /* renamed from: a */
    public final void mo53717a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase, LinkedHashMap linkedHashMap) {
        this.f96662a.f96699g.incrementAndGet();
        if (!this.f96669h) {
            mo69138b(new axxp(this.f96667f));
        }
        ArrayList arrayList = this.f96668g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            axxl.m83478a(linkedHashMap, (axxi) arrayList.get(i));
        }
    }

    public axxo(axxv axxv, Exception exc) {
        this.f96662a = axxv;
        sdo.m34959a(exc);
        mo69136a((Throwable) exc);
        this.f96663b = null;
        this.f96666e = false;
        this.f96664c = null;
        this.f96665d = null;
    }

    /* renamed from: a */
    public final boolean mo53718a(TimingLogger timingLogger, SQLiteDatabase sQLiteDatabase) {
        Cursor a = axxv.m83491a(sQLiteDatabase, this.f96663b, this.f96664c, this.f96665d, false, null, this.f96666e, "100");
        int count = a.getCount();
        timingLogger.addSplit("getDataItemsByHostAndPath");
        this.f96668g = this.f96662a.mo53732a(sQLiteDatabase, a);
        timingLogger.addSplit("deleteDataItemsByCursorCloseAndNotify");
        this.f96667f += this.f96668g.size();
        boolean z = count >= 100;
        this.f96669h = z;
        return z;
    }
}
