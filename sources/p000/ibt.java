package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ibt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ibt extends sji {

    /* renamed from: a */
    private static final AtomicInteger f20692a = new AtomicInteger(0);

    /* renamed from: d */
    private final ClientContext f20693d;

    /* renamed from: e */
    private final hxq f20694e;

    /* renamed from: f */
    private final ProxyGrpcRequest f20695f;

    /* renamed from: g */
    private final shl f20696g;

    public ibt(ClientContext clientContext, hxq hxq, ProxyGrpcRequest proxyGrpcRequest, shl shl) {
        super(16, "PerformProxyGrpcRequestOperation");
        this.f20693d = clientContext;
        this.f20694e = hxq;
        this.f20695f = proxyGrpcRequest;
        this.f20696g = shl;
    }

    /* renamed from: a */
    private final void m15206a(Context context, int i, int i2, Intent intent) {
        PendingIntent pendingIntent;
        if (intent != null) {
            try {
                pendingIntent = PendingIntent.getActivity(context, f20692a.getAndIncrement(), intent, 134217728);
            } catch (RemoteException e) {
                Log.e("AuthgRPCProxy", "RemoteException when proxying gRPC request");
                return;
            }
        } else {
            pendingIntent = null;
        }
        this.f20694e.mo12788a(new ProxyResponse(i, pendingIntent, i2, null));
    }

    /* renamed from: a */
    public final void mo11357a(Status status) {
    }

    /* renamed from: a */
    public final void mo11356a(Context context) {
        ibs ibs = new ibs();
        chtv a = chtv.m149566a(chtu.UNARY, this.f20695f.f10301f, ibs, ibs);
        try {
            shl shl = this.f20696g;
            ClientContext clientContext = this.f20693d;
            ProxyGrpcRequest proxyGrpcRequest = this.f20695f;
            this.f20694e.mo12788a(new ProxyResponse(0, null, chuv.f189215b.f189233s.f189211r, (byte[]) shl.mo25553a(a, clientContext, proxyGrpcRequest.f10300e, proxyGrpcRequest.f10299d, TimeUnit.MILLISECONDS)));
        } catch (UserRecoverableAuthException e) {
            Log.e("AuthgRPCProxy", "Token error");
            m15206a(context, 3004, -1, e.mo7366a());
        } catch (gid e2) {
            Log.e("AuthgRPCProxy", "Token error");
            m15206a(context, 3004, -1, null);
        } catch (chuw e3) {
            Log.e("AuthgRPCProxy", "gRPC StatusException", e3);
            m15206a(context, 0, e3.f189236a.f189233s.f189211r, null);
        } catch (RemoteException e4) {
            Log.e("AuthgRPCProxy", "RemoteException when proxying gRPC request");
        }
    }
}
