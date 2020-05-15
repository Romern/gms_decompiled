package p000;

import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.util.Arrays;

/* renamed from: bhpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhpx implements aubq {

    /* renamed from: a */
    final /* synthetic */ bhpy f119282a;

    public bhpx(bhpy bhpy) {
        this.f119282a = bhpy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!((auck) aucb).f91396d && aucb.mo50384b()) {
            FileGroupResponse fileGroupResponse = (FileGroupResponse) aucb.mo50386d();
            if (fileGroupResponse.f79963c.size() == 1) {
                befa befa = new befa(Arrays.asList(beff.m94940a(this.f119282a.f119283a).mo60653a()));
                MddFile mddFile = (MddFile) fileGroupResponse.f79963c.get(0);
                if (!mddFile.f79969a.equals(this.f119282a.f119285c)) {
                    try {
                        byte[] b = srz.m36178b((InputStream) befa.mo60643a(Uri.parse(mddFile.f79970b), behs.m95063a(), new beer[0]));
                        bhpy bhpy = this.f119282a;
                        bhpy.mo64144a(3, bhpy.mo64141a(b));
                        this.f119282a.mo64148c(3);
                        bhuj.m101555a();
                        this.f119282a.f119285c = mddFile.f79969a;
                    } catch (bxwf | InvalidObjectException e) {
                        this.f119282a.mo64143a(4);
                    } catch (IOException e2) {
                        this.f119282a.mo64143a(7);
                    }
                } else {
                    this.f119282a.mo64148c(3);
                }
            } else {
                this.f119282a.mo64143a(3);
            }
        } else {
            bhuj.m101555a();
            this.f119282a.mo64143a(6);
        }
    }
}
