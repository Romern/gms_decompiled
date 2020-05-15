package p000;

import android.content.ContentValues;
import java.util.LinkedHashMap;

/* renamed from: acmz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acmz {

    /* renamed from: a */
    public final acmu f60209a = new acmu();

    /* renamed from: b */
    public final acmw f60210b = new acmw();

    /* renamed from: c */
    public final acmv f60211c = new acmv();

    /* renamed from: d */
    public final acmx f60212d = new acmx();

    /* renamed from: e */
    public final acmy f60213e = new acmy();

    /* renamed from: f */
    public long f60214f = -1;

    /* renamed from: a */
    public final void mo32899a() {
        acmu acmu = this.f60209a;
        acmu.f60191a.setLength(0);
        acmu.f60192b.setLength(0);
        acmu.f60193c.setLength(0);
        acmu.f60194d.setLength(0);
        acmu.f60195e.setLength(0);
        acmu.f60196f.setLength(0);
        acmu.f60197g.setLength(0);
        acmu.f60198h = 0;
        acmu.f60199i = null;
        acmu.f60201k = null;
        acmu.f60200j = null;
        acmu.f60203m = 0;
        acmw acmw = this.f60210b;
        acmw.f60205a = 0;
        acmw.f60206b = 0;
        this.f60211c.f60204a.clear();
        this.f60212d.f60207a.clear();
        this.f60213e.f60208a.clear();
        this.f60214f = -1;
    }

    /* renamed from: b */
    public final acmo mo32900b() {
        acmu acmu = this.f60209a;
        ContentValues a = acms.m49464a(acmu.f60198h, acmu.f60199i, acmu.f60200j, acmu.f60201k, acmu.m49481a(acmu.f60191a), acmu.f60203m, acmu.m49481a(acmu.f60192b), acmu.m49481a(acmu.f60194d), acmu.m49481a(acmu.f60195e), acmu.m49481a(acmu.f60196f), acmu.m49481a(acmu.f60193c), acmu.m49481a(acmu.f60197g), acmu.f60202l);
        acmw acmw = this.f60210b;
        long j = acmw.f60205a;
        long j2 = acmw.f60206b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("TIMES_CONTACTED", Long.valueOf(j));
        contentValues.put("LAST_TIME_CONTACTED", Long.valueOf(j2));
        return new acmo(a, contentValues, new LinkedHashMap(this.f60211c.f60204a), new LinkedHashMap(this.f60212d.f60207a), new LinkedHashMap(this.f60213e.f60208a));
    }
}
