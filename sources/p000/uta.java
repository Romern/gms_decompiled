package p000;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.events.QueryResultEventParcelable;
import com.google.android.gms.drive.events.TransferProgressEvent;

/* renamed from: uta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class uta extends adzt {

    /* renamed from: a */
    private final Context f48625a;

    public uta(Looper looper, Context context) {
        super(looper);
        this.f48625a = context;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: vme.a(txb, boolean):void
     arg types: [txb, int]
     candidates:
      vme.a(boolean, boolean):void
      vme.a(android.view.ViewGroup, int):acm
      vme.a(acm, int):void
      vme.a(voc, voa):void
      abh.a(android.view.ViewGroup, int):acm
      abh.a(int, java.lang.Object):void
      abh.a(acm, int):void
      vne.a(voc, voa):void
      vme.a(txb, boolean):void */
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            utb.f48626a.mo25374b("EventCallback", "Don't know how to handle this event in context %s", this.f48625a);
            return;
        }
        Pair pair = (Pair) message.obj;
        uqa uqa = (uqa) pair.first;
        DriveEvent driveEvent = (DriveEvent) pair.second;
        int a = driveEvent.mo18144a();
        if (a == 1) {
            ChangeEvent changeEvent = (ChangeEvent) driveEvent;
            ((upo) uqa).mo27831a();
        } else if (a == 2) {
            CompletionEvent completionEvent = (CompletionEvent) driveEvent;
            ((upy) uqa).mo27849c();
        } else if (a == 3) {
            vmc vmc = (vmc) uqa;
            QueryResultEventParcelable queryResultEventParcelable = (QueryResultEventParcelable) driveEvent;
            DataHolder dataHolder = queryResultEventParcelable.f30784b;
            if (dataHolder != null) {
                txb txb = new usz(new txb(dataHolder)).f48624a;
                if (!vmc.equals(vmc.f49487a.f49497j)) {
                    txb.mo12460c();
                } else {
                    vmc.f49487a.mo28629a(txb, false);
                }
            }
            if (queryResultEventParcelable.f30785c) {
                int i = queryResultEventParcelable.f30786d;
                if (vmc.equals(vmc.f49487a.f49497j) && i == 1) {
                    vme vme = vmc.f49487a;
                    vme.f49494g = false;
                    vmt vmt = vme.f49503p;
                    if (vmt != null) {
                        vmt.mo28645a();
                    }
                }
            }
        } else if (a == 4) {
            ChangesAvailableEvent changesAvailableEvent = (ChangesAvailableEvent) driveEvent;
            ((upt) uqa).mo27837b();
        } else if (a != 8) {
            utb.f48626a.mo25375b("Unexpected event: %s", driveEvent);
        } else {
            new ura(((TransferProgressEvent) driveEvent).f30787a);
            ((uqg) uqa).mo27863a();
        }
    }
}
