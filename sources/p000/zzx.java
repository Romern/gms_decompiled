package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.BoundService;
import com.google.android.gms.common.apiservice.ILifecycleSynchronizerRequired;
import com.google.android.gms.common.apiservice.LifecycleSynchronizer;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class zzx extends BoundService implements ILifecycleSynchronizerRequired {

    /* renamed from: a */
    private ArrayList f56351a;

    /* renamed from: c */
    protected List f56352c;

    /* renamed from: d */
    protected List f56353d;

    /* renamed from: e */
    public LifecycleSynchronizer f56354e;

    /* renamed from: f */
    public bqgj f56355f;

    /* renamed from: g */
    public Set f56356g;

    /* renamed from: h */
    public Map f56357h;

    /* renamed from: i */
    public int[] f56358i;

    /* renamed from: j */
    public int f56359j;

    public zzx(int i, String str, Set set, int i2, int i3) {
        this(new int[]{i}, new String[]{str}, set, i2, i3, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6267a(aaac aaac, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17600a(Bundle bundle, IBinder iBinder) {
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("==== ApiService dumped info ====");
        printWriter.printf("ID: %s\n", Arrays.toString(this.f56358i));
        printWriter.printf("Action: %s\n", TextUtils.join(",", this.f56351a));
        printWriter.printf("Visibility: %d\n", Integer.valueOf(this.f56359j));
        printWriter.printf("OperationCount: %d\n", Integer.valueOf(this.f56354e.getRefCount()));
        printWriter.printf("Executor: %s", this.f56355f.toString());
    }

    public IBinder onBind(Intent intent) {
        if (!this.f56351a.contains(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("ApiService", valueOf.length() == 0 ? new String("incompatible service action: ") : "incompatible service action: ".concat(valueOf));
            return null;
        } else if (Build.VERSION.SDK_INT <= Build.VERSION.SDK_INT) {
            int[] iArr = this.f56358i;
            return new zzw(this, this, iArr[0], iArr);
        } else {
            int i = Build.VERSION.SDK_INT;
            StringBuilder sb = new StringBuilder(57);
            sb.append("This API is no longer supported on API level: ");
            sb.append(i);
            Log.w("ApiService", sb.toString());
            return null;
        }
    }

    public final void setLifecycleSynchronizer(LifecycleSynchronizer lifecycleSynchronizer) {
        this.f56354e = lifecycleSynchronizer;
    }

    public zzx(int[] iArr, String[] strArr, Set set, int i, int i2) {
        this(iArr, strArr, set, i, i2, 1, null);
    }

    public zzx(int[] iArr, String[] strArr, Set set, int i, int i2, int i3, Map map) {
        this(iArr, strArr, set, i, sne.m35694a(i3, i2), map);
    }

    public zzx(int[] iArr, String[] strArr, Set set, int i, bqgj bqgj, Map map) {
        sdo.m34959a(iArr);
        boolean z = true;
        sdo.m34974b(iArr.length > 0);
        sdo.m34959a(strArr);
        int length = strArr.length;
        sdo.m34974b(length <= 0 ? false : z);
        for (String str : strArr) {
            sdo.m34977c(str);
        }
        this.f56358i = iArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        this.f56351a = arrayList;
        Collections.addAll(arrayList, strArr);
        this.f56359j = i;
        this.f56355f = bqgj;
        this.f56356g = set;
        this.f56357h = map;
        this.f56352c = bngx.m109376e();
        this.f56353d = bngx.m109376e();
    }
}
