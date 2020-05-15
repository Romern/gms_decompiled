package p000;

import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import com.google.firebase.appindexing.internal.Thing;
import java.util.List;
import java.util.Map;

/* renamed from: abxy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abxy {
    /* renamed from: a */
    public static void m48518a(abyy abyy, abrv abrv, Map map) {
        if (((Boolean) acaw.f59316at.mo58455c()).booleanValue()) {
            int i = Build.VERSION.SDK_INT;
            for (List list : map.values()) {
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        Thing thing = (Thing) list.get(i2);
                        String[] a = thing.f152371c.mo72359a("sliceUri");
                        if (a != null && a.length > 0) {
                            if (((Boolean) acaw.f59318av.mo58455c()).booleanValue()) {
                                Parcel obtain = Parcel.obtain();
                                brjf.m114100a(thing, obtain, 0);
                                obtain.setDataPosition(0);
                                thing = (Thing) Thing.CREATOR.createFromParcel(obtain);
                                list.set(i2, thing);
                            }
                            Uri parse = Uri.parse(a[0]);
                            apl a2 = apl.m1813a(abrv.f58066b);
                            if (a2.f1930a.checkSlicePermission(parse, Process.myPid(), Process.myUid()) == 0) {
                                abyb abyb = new abyb(bqbd.RETRIEVE_SLICE, abyy.f58780f, abrv.f58066b, parse, abrv.f58084t);
                                abrv.f58067c.mo32995d(abyb);
                                abya abya = (abya) abyb.mo32295h();
                                if (abya.f58713b == null) {
                                    byte[] byteArray = abya.f58712a.toByteArray();
                                    if (((Boolean) acaw.f59314ar.mo58455c()).booleanValue()) {
                                        int length = byteArray.length;
                                        if (((long) length) > ((Long) abzt.f58978cm.mo58455c()).longValue()) {
                                            String valueOf = String.valueOf(abzt.f58978cm.mo58455c());
                                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 97);
                                            sb.append("Slice error. Slice is ");
                                            sb.append(length);
                                            sb.append(" bytes, which is larger than the maximum allowed size of ");
                                            sb.append(valueOf);
                                            sb.append(" bytes.");
                                            throw new abxx(sb.toString(), parse, bpzq.SLICE_TOO_LARGE);
                                        }
                                    }
                                    thing.f152370b.putByteArray("serializedSliceBytes", byteArray);
                                    absg.m48203d("Added serialized Slice of size %d bytes to Indexable uri %s", Integer.valueOf(byteArray.length), thing.f152372d);
                                } else {
                                    absg.m48185a("Failed to retrieve Slice for sliceUri %s", a[0]);
                                    throw abya.f58713b;
                                }
                            } else {
                                absg.m48185a("Permission not granted to retrieve Slice uri: %s", parse);
                                return;
                            }
                        }
                        i2++;
                    }
                }
            }
        }
    }
}
