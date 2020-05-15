package p000;

import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: sjh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sjh extends Service {

    /* renamed from: a */
    private ArrayList f44563a;

    /* renamed from: b */
    protected List f44564b;

    /* renamed from: c */
    public sjt f44565c;

    /* renamed from: d */
    public bqgj f44566d;

    /* renamed from: e */
    public Set f44567e;

    /* renamed from: f */
    public Map f44568f;

    /* renamed from: g */
    public int[] f44569g;

    /* renamed from: h */
    public int f44570h;

    public sjh(int i, String str, Set set, int i2, int i3) {
        this(new int[]{i}, new String[]{str}, set, i2, i3, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7277a(sjj sjj, GetServiceRequest getServiceRequest);

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        printWriter.println("==== ApiService dumped info ====");
        printWriter.printf("ID: %s\n", Arrays.toString(this.f44569g));
        printWriter.printf("Action: %s\n", TextUtils.join(",", this.f44563a));
        printWriter.printf("Visibility: %d\n", Integer.valueOf(this.f44570h));
        Object[] objArr = new Object[1];
        sjt sjt = this.f44565c;
        synchronized (sjt.f44591b) {
            i = sjt.f44590a;
        }
        objArr[0] = Integer.valueOf(i);
        printWriter.printf("OperationCount: %d\n", objArr);
        printWriter.printf("Executor: %s", this.f44566d.toString());
    }

    public IBinder onBind(Intent intent) {
        if (!this.f44563a.contains(intent.getAction())) {
            String valueOf = String.valueOf(intent.getAction());
            Log.w("ApiService", valueOf.length() == 0 ? new String("incompatible service action: ") : "incompatible service action: ".concat(valueOf));
            return null;
        }
        int[] iArr = this.f44569g;
        return new sjg(this, this, iArr[0], iArr);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        sjt sjt = this.f44565c;
        synchronized (sjt.f44591b) {
            if (sjt.f44590a == 0) {
                sjt.f44593d.stopSelf();
            }
        }
        return 2;
    }

    public sjh(int i, String str, Set set, int i2, bqgj bqgj, Map map) {
        this(new int[]{i}, new String[]{str}, set, i2, bqgj, map);
    }

    public sjh(int[] iArr, String[] strArr, Set set, int i, int i2) {
        this(iArr, strArr, set, i, i2, 1, null);
    }

    public sjh(int[] iArr, String[] strArr, Set set, int i, int i2, int i3, Map map) {
        this(iArr, strArr, set, i, sne.m35694a(i3, i2), map);
    }

    public sjh(int[] iArr, String[] strArr, Set set, int i, bqgj bqgj, Map map) {
        sdo.m34959a(iArr);
        boolean z = true;
        sdo.m34974b(iArr.length > 0);
        sdo.m34959a(strArr);
        int length = strArr.length;
        sdo.m34974b(length <= 0 ? false : z);
        for (String str : strArr) {
            sdo.m34977c(str);
        }
        this.f44569g = iArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        this.f44563a = arrayList;
        Collections.addAll(arrayList, strArr);
        this.f44570h = i;
        this.f44566d = bqgj;
        this.f44567e = set;
        this.f44568f = map;
        this.f44565c = new sjt(this);
        bngx.m109376e();
        this.f44564b = bngx.m109376e();
    }
}
