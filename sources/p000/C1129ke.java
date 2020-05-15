package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ke */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1129ke implements Iterable {

    /* renamed from: a */
    private final ArrayList f23911a = new ArrayList();

    /* renamed from: b */
    private final Context f23912b;

    private C1129ke(Context context) {
        this.f23912b = context;
    }

    /* renamed from: a */
    public static C1129ke m17707a(Context context) {
        return new C1129ke(context);
    }

    /* renamed from: b */
    public final PendingIntent mo14423b() {
        if (!this.f23911a.isEmpty()) {
            ArrayList arrayList = this.f23911a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            int i = Build.VERSION.SDK_INT;
            return PendingIntent.getActivities(this.f23912b, 0, intentArr, 134217728, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    @Deprecated
    public final Iterator iterator() {
        return this.f23911a.iterator();
    }

    /* renamed from: a */
    public final void mo14419a() {
        if (!this.f23911a.isEmpty()) {
            ArrayList arrayList = this.f23911a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Context context = this.f23912b;
            int i = Build.VERSION.SDK_INT;
            context.startActivities(intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: a */
    public final void mo14420a(Activity activity) {
        Intent intent;
        if (activity instanceof C1128kd) {
            intent = ((C1128kd) activity).mo8630aY();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C1094ix.m16254b(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f23912b.getPackageManager());
            }
            mo14421a(component);
            mo14422a(intent);
        }
    }

    /* renamed from: a */
    public final void mo14421a(ComponentName componentName) {
        int size = this.f23911a.size();
        try {
            Intent a = C1094ix.m16251a(this.f23912b, componentName);
            while (a != null) {
                this.f23911a.add(size, a);
                a = C1094ix.m16251a(this.f23912b, a.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public final void mo14422a(Intent intent) {
        this.f23911a.add(intent);
    }
}
