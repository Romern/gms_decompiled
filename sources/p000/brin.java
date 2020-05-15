package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.firebase.appindexing.internal.MutateRequest;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: brin */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brin extends brhj {

    /* renamed from: a */
    static final String[] f142878a = {"com.google.android.googlequicksearchbox", "com.google.android.gms"};

    /* renamed from: b */
    final brim f142879b;

    /* renamed from: c */
    private final Context f142880c;

    public brin(Context context) {
        rjx rjx = new rjx(context, (byte[]) null);
        this.f142880c = context;
        this.f142879b = new brim(rjx);
    }

    /* renamed from: c */
    private static final Thing[] m114059c(brhy... brhyArr) {
        if (brhyArr == null) {
            return null;
        }
        int length = brhyArr.length;
        Thing[] thingArr = new Thing[length];
        System.arraycopy(brhyArr, 0, thingArr, 0, length);
        return thingArr;
    }

    /* renamed from: a */
    public final aucb mo69566a(MutateRequest mutateRequest) {
        boolean isEmpty;
        brim brim = this.f142879b;
        bril bril = new bril(brim, mutateRequest);
        auck auck = bril.f142872b.f91388a;
        auck.mo50378a(brim, brim);
        synchronized (brim.f142875b) {
            isEmpty = brim.f142875b.isEmpty();
            brim.f142875b.add(bril);
        }
        if (isEmpty) {
            bril.mo69564a();
        }
        return auck;
    }

    /* renamed from: b */
    public final aucb mo32872b(brhy... brhyArr) {
        try {
            return mo69566a(MutateRequest.m118868b(m114059c(brhyArr)));
        } catch (ArrayStoreException e) {
            return aucu.m76777a((Exception) new brho("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    /* renamed from: b */
    public final aucb mo32873b(String... strArr) {
        return mo69566a(MutateRequest.m118869b(strArr));
    }

    /* renamed from: a */
    public final aucb mo32869a(brhy... brhyArr) {
        boolean z;
        try {
            Thing[] c = m114059c(brhyArr);
            if (celu.f182917a.mo6606a().mo79286c()) {
                int i = Build.VERSION.SDK_INT;
                Context context = this.f142880c;
                if (context != null) {
                    if (c != null && (r1 = c.length) > 0) {
                        int i2 = Build.VERSION.SDK_INT;
                        brjc brjc = new brjc(context);
                        for (Thing thing : c) {
                            if (thing != null) {
                                String[] a = thing.f152371c.mo72359a("sliceUri");
                                boolean z2 = true;
                                if (a == null || a.length <= 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                boolean[] c2 = thing.f152371c.mo72361c("grantSlicePermission");
                                if (c2 == null || c2.length <= 0 || !c2[0]) {
                                    z2 = false;
                                }
                                if (z && z2) {
                                    String str = a[0];
                                    for (String str2 : f142878a) {
                                        try {
                                            brjc.f142893a.grantSlicePermission(str2, Uri.parse(str));
                                        } catch (Exception e) {
                                            String valueOf = String.valueOf(e);
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                                            sb.append("Error trying to grant permission to Slice Uris: ");
                                            sb.append(valueOf);
                                            String sb2 = sb.toString();
                                            if (briy.m114098a(5)) {
                                                Log.w("FirebaseAppIndex", sb2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return mo69566a(MutateRequest.m118866a(c));
        } catch (ArrayStoreException e2) {
            return aucu.m76777a((Exception) new brho("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
        }
    }

    /* renamed from: a */
    public final aucb mo32870a(String... strArr) {
        return mo69566a(MutateRequest.m118867a(strArr));
    }
}
