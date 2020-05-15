package p000;

import android.content.Context;
import android.database.Cursor;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import java.util.HashSet;
import java.util.TreeSet;

/* renamed from: apmw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apmw extends aplq {

    /* renamed from: a */
    private final abrv f84736a;

    public apmw(abrv abrv, GetAppIndexingPackagesCall$Request getAppIndexingPackagesCall$Request, abyy abyy) {
        super(bqbd.GET_APP_INDEXING_PACKAGES, 1, 4, abrv.f58066b, getAppIndexingPackagesCall$Request, abyy);
        this.f84736a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        abrv abrv = this.f84736a;
        Context context = abrv.f58066b;
        abzo a = abrv.mo32298a();
        TreeSet treeSet = new TreeSet();
        bnre i = a.mo32541c().listIterator();
        while (i.hasNext()) {
            absr absr = (absr) i.next();
            if (abzm.m48657e(absr)) {
                treeSet.add(absr.f58140e);
            }
        }
        abxp a2 = abxp.m48475a(context);
        HashSet hashSet = new HashSet();
        if (a2.mo32418a()) {
            Cursor rawQuery = a2.f58691a.getReadableDatabase().rawQuery("SELECT DISTINCT package FROM [errors]UNION SELECT DISTINCT package FROM [user_actions]", null);
            try {
                int columnIndex = rawQuery.getColumnIndex("package");
                while (rawQuery.moveToNext()) {
                    hashSet.add(rawQuery.getString(columnIndex));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        treeSet.addAll(hashSet);
        return new GetAppIndexingPackagesCall$Response(Status.f30107a, (String[]) treeSet.toArray(new String[treeSet.size()]), (String[]) abvs.m48361a(context).toArray(new String[0]));
        throw th;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        return new GetAppIndexingPackagesCall$Response(status, null, null);
    }
}
