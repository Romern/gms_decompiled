package p000;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bezq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bezq implements cijl {

    /* renamed from: a */
    private static final srn f113178a = srn.m36125a("MddGeofenceProvider");

    /* renamed from: b */
    private final Context f113179b;

    /* renamed from: c */
    private final cijl f113180c;

    public bezq(Context context, cijl cijl) {
        this.f113179b = context;
        this.f113180c = cijl;
    }

    /* renamed from: b */
    private final List m96179b() {
        befa befa = new befa(Arrays.asList(new ahbh(this.f113179b)));
        aucb a = afkf.m53198a(this.f113179b).mo34919a("location_bluesky_geofence", "com.google.android.gms");
        try {
            aucu.m76783a(a, 1000, TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) a.mo50386d();
            if (!fileGroupResponse.f79963c.isEmpty()) {
                InputStream inputStream = (InputStream) befa.mo60643a(Uri.parse(((MddFile) fileGroupResponse.f79963c.get(0)).f79970b), behs.m95063a(), new beer[0]);
                try {
                    bezs bezs = (bezs) bxvk.m124011a(bezs.f113185b, inputStream, bxus.m123743b());
                    int size = bezs.f113187a.size();
                    ArrayList arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add(bezp.m96178a(bezs.f113187a.mo74151b(i)));
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return arrayList;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } else {
                throw new FileNotFoundException();
            }
            throw th;
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6445a() {
        try {
            return m96179b();
        } catch (IOException e) {
            ((bnsl) f113178a.mo68390d()).mo68405a("MDD read failed, using default.");
            return ((bezo) this.f113180c).mo6445a();
        }
    }
}
