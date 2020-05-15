package p000;

import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;

/* renamed from: aiys */
final /* synthetic */ class aiys implements Runnable {

    /* renamed from: a */
    private final aiyt f70100a;

    /* renamed from: b */
    private final bzbu f70101b;

    /* renamed from: c */
    private final ajgm f70102c;

    public aiys(aiyt aiyt, bzbu bzbu, ajgm ajgm) {
        this.f70100a = aiyt;
        this.f70101b = bzbu;
        this.f70102c = ajgm;
    }

    public final void run() {
        RemoteCallbackList remoteCallbackList;
        aiyt aiyt = this.f70100a;
        bzbu bzbu = this.f70101b;
        ajgm ajgm = this.f70102c;
        ajaw ajaw = aiyt.f70103a;
        if (ajaw != null && (remoteCallbackList = ajaw.f70286a.f70290b) != null) {
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i = 0; i < beginBroadcast; i++) {
                try {
                    bvhf bvhf = (bvhf) ajaw.f70286a.f70290b.getBroadcastItem(i);
                    bxvd da = byuo.f168318b.mo74144da();
                    bxvd da2 = byun.f168313d.mo74144da();
                    String a = ajgm.f70586a.mo36407a();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    byun byun = (byun) da2.f164949b;
                    a.getClass();
                    int i2 = byun.f168315a | 1;
                    byun.f168315a = i2;
                    byun.f168316b = a;
                    byun.f168317c = bzbu.f169275k;
                    byun.f168315a = i2 | 2;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    byuo byuo = (byuo) da.f164949b;
                    byun byun2 = (byun) da2.mo74062i();
                    byun2.getClass();
                    if (!byuo.f168320a.mo73666a()) {
                        byuo.f168320a = bxvk.m124021a(byuo.f168320a);
                    }
                    byuo.f168320a.add(byun2);
                    byte[] k = ((byuo) da.mo74062i()).mo73642k();
                    Parcel bj = bvhf.mo8529bj();
                    bj.writeByteArray(k);
                    bvhf.mo8530c(3, bj);
                } catch (RemoteException e) {
                } catch (Throwable th) {
                    ajaw.f70286a.f70290b.finishBroadcast();
                    throw th;
                }
            }
            ajaw.f70286a.f70290b.finishBroadcast();
        }
    }
}
