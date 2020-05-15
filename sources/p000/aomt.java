package p000;

import android.graphics.Bitmap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.model.posts.Post;
import com.google.android.gms.plus.model.posts.Settings;
import com.google.android.gms.plus.sharebox.AddToCircleData;
import com.google.android.gms.plus.sharebox.Circle;

/* renamed from: aomt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface aomt extends aomd {
    /* renamed from: a */
    void mo43030a(Bitmap bitmap);

    /* renamed from: a */
    void mo43031a(ConnectionResult connectionResult);

    /* renamed from: a */
    void mo43032a(ConnectionResult connectionResult, ansz ansz);

    /* renamed from: a */
    void mo43033a(ConnectionResult connectionResult, Post post);

    /* renamed from: a */
    void mo43034a(ConnectionResult connectionResult, Settings settings);

    /* renamed from: a */
    void mo43035a(Status status);

    /* renamed from: a */
    void mo43036a(Status status, AddToCircleData addToCircleData);

    /* renamed from: a */
    void mo43037a(Status status, Circle circle);

    /* renamed from: a */
    void mo43038a(Status status, String str, String[] strArr);

    /* renamed from: a */
    void mo43039a(String[] strArr, int i);
}
