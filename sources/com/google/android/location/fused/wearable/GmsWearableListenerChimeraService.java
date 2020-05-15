package com.google.android.location.fused.wearable;

import com.google.android.gms.wearable.internal.MessageEventParcelable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class GmsWearableListenerChimeraService extends axpp {

    /* renamed from: a */
    private static final bfvt f150771a = new bfvt();

    /* renamed from: h */
    private static final ArrayList f150772h = new ArrayList();

    static {
        rjo rjo = axoz.f96226a;
    }

    /* renamed from: a */
    public final void mo53375a(axoj axoj) {
        synchronized (f150771a.f115442a) {
        }
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bfvt bfvt = f150771a;
        printWriter.print("current capability state: ");
        synchronized (bfvt.f115442a) {
            boolean z = bfvt.f115443b;
            boolean z2 = bfvt.f115444c;
            printWriter.println("uninited");
            for (axoj axoj : bfvt.f115445d.values()) {
                String a = axoj.mo53306a();
                String valueOf = String.valueOf(axoj.mo53307b());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 4 + String.valueOf(valueOf).length());
                sb.append("  ");
                sb.append(a);
                sb.append(": ");
                sb.append(valueOf);
                printWriter.println(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo7590a(MessageEventParcelable messageEventParcelable) {
        synchronized (f150772h) {
            Iterator it = f150772h.iterator();
            while (it.hasNext()) {
                ((axot) it.next()).mo7590a(messageEventParcelable);
            }
        }
    }
}
