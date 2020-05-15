package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.trustagent.common.framework.model.ModelStore$DataChangeReceiver;
import com.google.android.gms.trustagent.common.framework.model.p069be.ModelContentChimeraProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aumr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aumr {

    /* renamed from: c */
    private static WeakReference f92089c = new WeakReference(null);

    /* renamed from: a */
    public final Map f92090a = new HashMap();

    /* renamed from: b */
    public final Object f92091b = new Object();

    /* renamed from: d */
    private final Context f92092d;

    /* renamed from: e */
    private final ContentResolver f92093e;

    /* renamed from: f */
    private ModelStore$DataChangeReceiver f92094f;

    private aumr(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        sdo.m34959a(context);
        this.f92092d = context;
        sdo.m34959a(contentResolver);
        this.f92093e = contentResolver;
    }

    /* renamed from: a */
    public static synchronized aumr m77322a(Context context) {
        aumr aumr;
        synchronized (aumr.class) {
            aumr = (aumr) f92089c.get();
            if (aumr == null) {
                aumr = new aumr(context.getApplicationContext());
                f92089c = new WeakReference(aumr);
            }
        }
        return aumr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        return;
     */
    /* renamed from: b */
    public final void mo50678b(Class cls, aumq aumq) {
        synchronized (this.f92091b) {
            aumm a = aump.m77317a(cls);
            List list = (List) this.f92090a.get(a.mo50668a());
            if (list != null) {
                list.remove(aumq);
                if (list.size() == 0) {
                    this.f92090a.remove(a.mo50668a());
                }
                if (this.f92090a.size() == 0) {
                    this.f92092d.unregisterReceiver(this.f92094f);
                }
            }
        }
    }

    /* renamed from: a */
    public final auml mo50673a(Class cls) {
        aumm a = aump.m77317a(cls);
        auml a2 = mo50674a(cls, "model_id");
        return a2 == null ? a.mo50666a("model_id", new ContentValues()) : a2;
    }

    /* renamed from: a */
    public final auml mo50674a(Class cls, String str) {
        aumm a = aump.m77317a(cls);
        Cursor query = this.f92093e.query(ModelContentChimeraProvider.m93416a(a.mo50668a(), str), null, null, null, null);
        if (query != null) {
            try {
                if (!query.isAfterLast()) {
                    query.moveToFirst();
                    return aumo.m77315a(a, query);
                }
                query.close();
                return null;
            } finally {
                query.close();
            }
        } else {
            throw new aumn("cursor is null!");
        }
    }

    /* renamed from: a */
    public final List mo50675a(Class cls, Map map) {
        aumm a = aump.m77317a(cls);
        Uri.Builder buildUpon = ModelContentChimeraProvider.m93415a(a.mo50668a()).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Cursor query = this.f92093e.query(buildUpon.build(), null, null, null, null);
        if (query != null) {
            try {
                ArrayList arrayList = new ArrayList();
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    arrayList.add(aumo.m77315a(a, query));
                    query.moveToNext();
                }
                return arrayList;
            } finally {
                query.close();
            }
        } else {
            throw new aumn("Null cursor!");
        }
    }

    /* renamed from: a */
    public final void mo50676a(auml auml) {
        this.f92093e.insert(ModelContentChimeraProvider.m93416a(aump.m77317a(auml.getClass()).mo50668a(), auml.f92085d), auml.f92086e);
    }

    /* renamed from: a */
    public final void mo50677a(Class cls, aumq aumq) {
        synchronized (this.f92091b) {
            aumm a = aump.m77317a(cls);
            int size = this.f92090a.size();
            List list = (List) this.f92090a.get(a.mo50668a());
            if (list == null) {
                list = new ArrayList();
                this.f92090a.put(a.mo50668a(), list);
            }
            list.add(aumq);
            if (size == 0) {
                ModelStore$DataChangeReceiver modelStore$DataChangeReceiver = new ModelStore$DataChangeReceiver(this);
                this.f92094f = modelStore$DataChangeReceiver;
                this.f92092d.registerReceiver(modelStore$DataChangeReceiver, new IntentFilter("com.google.android.gms.trustagent.framework.model.action.DATA_CHANGE_NOTIFICATION"));
            }
        }
    }
}
