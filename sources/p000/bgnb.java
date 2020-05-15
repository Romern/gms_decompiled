package p000;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bgnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgnb {

    /* renamed from: a */
    public boolean f116833a;

    /* renamed from: b */
    public final bgns f116834b;

    /* renamed from: c */
    public Context f116835c;

    /* renamed from: d */
    public final bugp f116836d;

    /* renamed from: e */
    public final bgjl f116837e;

    /* renamed from: f */
    public volatile boolean f116838f;

    /* renamed from: g */
    public bgna f116839g;

    /* renamed from: h */
    public bugr f116840h;

    public bgnb() {
        this.f116833a = false;
    }

    /* renamed from: a */
    public final boolean mo63019a(buft buft) {
        bugu a;
        bugr bugr = this.f116840h;
        if (!(bugr == null || (a = bugr.mo72640a(97, 1, buft)) == null)) {
            try {
                int intValue = ((Integer) a.get(2, TimeUnit.SECONDS)).intValue();
                if (intValue != 0) {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Failed to send request to nanoapp: request result=");
                    sb.append(intValue);
                    sb.toString();
                } else {
                    int a2 = bufr.m119415a(buft.f153739b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    String valueOf = String.valueOf(Integer.toString(a2 - 1));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 61);
                    sb2.append("Sent request to nanoapp: request command=");
                    sb2.append(valueOf);
                    sb2.append(", result=");
                    sb2.append(0);
                    sb2.toString();
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                String valueOf2 = String.valueOf(e.getMessage());
                if (valueOf2.length() == 0) {
                    new String("Failed to send request to nanoapp: ");
                } else {
                    "Failed to send request to nanoapp: ".concat(valueOf2);
                }
            }
        }
        return false;
    }

    public bgnb(bgns bgns, bugp bugp, Context context) {
        this.f116833a = false;
        this.f116835c = null;
        this.f116837e = new bgjl(this);
        this.f116839g = null;
        this.f116840h = null;
        this.f116834b = bgns;
        this.f116836d = bugp;
        this.f116835c = context;
    }
}
