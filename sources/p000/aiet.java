package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.File;
import java.io.IOException;

/* renamed from: aiet */
final /* synthetic */ class aiet implements roo {

    /* renamed from: a */
    private final String f68850a;

    /* renamed from: b */
    private final ahiq f68851b;

    public aiet(String str, ahiq ahiq) {
        this.f68850a = str;
        this.f68851b = ahiq;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Pair pair;
        String str = this.f68850a;
        ahiq ahiq = this.f68851b;
        aieh aieh = (aieh) obj;
        aifj aifj = new aifj((aucf) obj2);
        String[] strArr = {str};
        try {
            int i = ahiq.f67252b;
            if (i == 1) {
                aiic aiic = new aiic();
                aiic.mo37510a(ahiq.f67251a);
                aiic.mo37509a(ahiq.f67252b);
                aiic.mo37513a(ahiq.f67253c);
                pair = Pair.create(aiic.f68912a, null);
            } else if (i != 2) {
                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor[] createPipe2 = ParcelFileDescriptor.createPipe();
                aiic aiic2 = new aiic();
                aiic2.mo37510a(ahiq.f67251a);
                aiic2.mo37509a(ahiq.f67252b);
                aiic2.mo37511a(createPipe[0]);
                ParcelFileDescriptor parcelFileDescriptor = createPipe2[0];
                ParcelablePayload parcelablePayload = aiic2.f68912a;
                parcelablePayload.f80611g = parcelFileDescriptor;
                pair = Pair.create(parcelablePayload, Pair.create(createPipe[1], createPipe2[1]));
            } else {
                File file = ahiq.f67254d.f67246a;
                String absolutePath = file != null ? file.getAbsolutePath() : null;
                aiic aiic3 = new aiic();
                aiic3.mo37510a(ahiq.f67251a);
                aiic3.mo37509a(ahiq.f67252b);
                aiic3.mo37511a(ahiq.f67254d.f67247b);
                aiic3.mo37512a(absolutePath);
                aiic3.mo37514b(ahiq.f67254d.f67248c);
                pair = Pair.create(aiic3.f68912a, null);
            }
            aiii aiii = new aiii();
            aiii.mo37529a(new aiee(aifj));
            aiii.mo37532a(strArr);
            aiii.mo37530a((ParcelablePayload) pair.first);
            ((aigl) aieh.mo25289B()).mo36597a(aiii.f68915a);
            if (pair.second != null) {
                Pair pair2 = (Pair) pair.second;
                aiib aiib = aieh.f68832d;
                aiib.f68909a.execute(new aiia(aiib, ahiq.f67255e.mo36538a(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.first), ahiq.f67251a, new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair2.second)));
            }
        } catch (IOException e) {
            Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(ahiq.f67251a)), e);
            throw e;
        } catch (IOException e2) {
            aifj.mo9482a((Object) aieh.m57074c(8013));
        }
    }
}
