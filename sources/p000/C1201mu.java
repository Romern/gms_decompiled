package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: mu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1201mu {

    /* renamed from: a */
    static final C1231nx f26695a = new C1231nx(16);

    /* renamed from: b */
    static final Object f26696b = new Object();

    /* renamed from: c */
    static final C1245ok f26697c = new C1245ok();

    /* renamed from: d */
    private static final C1208na f26698d = new C1208na("fonts");

    /* renamed from: e */
    private static final Comparator f26699e = new C1197mq();

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        p000.C1201mu.f26698d.mo15488a(new p000.C1204mx(r2, new android.os.Handler(), new p000.C1196mp(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        return null;
     */
    /* renamed from: a */
    public static Typeface m19647a(Context context, C1193mm mmVar, C1161li liVar, boolean z, int i, int i2) {
        C1195mo moVar;
        ReentrantLock reentrantLock;
        Object obj;
        String str = mmVar.f26680e + "-" + i2;
        Typeface typeface = (Typeface) f26695a.mo15546a(str);
        if (typeface != null) {
            if (liVar != null) {
                liVar.mo15154a(typeface);
            }
            return typeface;
        } else if (z && i == -1) {
            C1200mt a = m19648a(context, mmVar, i2);
            if (liVar != null) {
                int i3 = a.f26694b;
                if (i3 == 0) {
                    liVar.mo15156b(a.f26693a);
                } else {
                    liVar.mo15155b(i3);
                }
            }
            return a.f26693a;
        } else {
            C1194mn mnVar = new C1194mn(context, mmVar, i2, str);
            if (z) {
                try {
                    C1208na naVar = f26698d;
                    reentrantLock = new ReentrantLock();
                    Condition newCondition = reentrantLock.newCondition();
                    AtomicReference atomicReference = new AtomicReference();
                    AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                    naVar.mo15488a(new C1205my(atomicReference, mnVar, reentrantLock, atomicBoolean, newCondition));
                    reentrantLock.lock();
                    if (atomicBoolean.get()) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
                        while (true) {
                            try {
                                nanos = newCondition.awaitNanos(nanos);
                            } catch (InterruptedException e) {
                            }
                            if (!atomicBoolean.get()) {
                                obj = atomicReference.get();
                                break;
                            } else if (nanos <= 0) {
                                throw new InterruptedException("timeout");
                            }
                        }
                    } else {
                        obj = atomicReference.get();
                    }
                    reentrantLock.unlock();
                    return ((C1200mt) obj).f26693a;
                } catch (InterruptedException e2) {
                    return null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } else {
                if (liVar != null) {
                    moVar = new C1195mo(liVar);
                } else {
                    moVar = null;
                }
                synchronized (f26696b) {
                    ArrayList arrayList = (ArrayList) f26697c.get(str);
                    if (arrayList == null) {
                        if (moVar != null) {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(moVar);
                            f26697c.put(str, arrayList2);
                        }
                    } else if (moVar != null) {
                        arrayList.add(moVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x017e A[Catch:{ NameNotFoundException -> 0x0268 }] */
    /* renamed from: a */
    static C1200mt m19648a(Context context, C1193mm mmVar, int i) {
        C1198mr mrVar;
        Typeface typeface;
        int i2;
        int i3;
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        Cursor cursor;
        int i4;
        Uri uri;
        int i5;
        boolean z;
        C1193mm mmVar2 = mmVar;
        try {
            PackageManager packageManager = context.getPackageManager();
            context.getResources();
            String str = mmVar2.f26676a;
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            } else if (resolveContentProvider.packageName.equals(mmVar2.f26677b)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Collections.sort(arrayList, f26699e);
                List list = mmVar2.f26679d;
                int i6 = 0;
                loop1:
                while (true) {
                    if (i6 >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i6));
                    Collections.sort(arrayList2, f26699e);
                    if (arrayList.size() == arrayList2.size()) {
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i7), (byte[]) arrayList2.get(i7))) {
                                i7++;
                            }
                        }
                        break loop1;
                    }
                    i6++;
                }
                int i8 = 1;
                if (resolveContentProvider != null) {
                    String str2 = resolveContentProvider.authority;
                    ArrayList arrayList3 = new ArrayList();
                    Uri build = new Uri.Builder().scheme("content").authority(str2).build();
                    Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                    try {
                        int i9 = Build.VERSION.SDK_INT;
                        cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{mmVar2.f26678c}, null, null);
                        if (cursor != null) {
                            try {
                                if (cursor.getCount() > 0) {
                                    int columnIndex = cursor.getColumnIndex("result_code");
                                    arrayList3 = new ArrayList();
                                    int columnIndex2 = cursor.getColumnIndex("_id");
                                    int columnIndex3 = cursor.getColumnIndex("file_id");
                                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                                    while (cursor.moveToNext()) {
                                        if (columnIndex != -1) {
                                            cursor.getInt(columnIndex);
                                        }
                                        if (columnIndex4 != -1) {
                                            i4 = cursor.getInt(columnIndex4);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (columnIndex3 != -1) {
                                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                        } else {
                                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                                        }
                                        if (columnIndex5 != -1) {
                                            i5 = cursor.getInt(columnIndex5);
                                        } else {
                                            i5 = 400;
                                        }
                                        if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        arrayList3.add(new C1199ms(uri, i4, i5, z));
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        mrVar = new C1198mr(0, (C1199ms[]) arrayList3.toArray(new C1199ms[0]));
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } else {
                    mrVar = new C1198mr(1, null);
                }
                if (mrVar.f26687a != 0) {
                    return new C1200mt(null, -2);
                }
                C1199ms[] msVarArr = mrVar.f26688b;
                C1231nx nxVar = C1171lr.f26626a;
                ContentResolver contentResolver = context.getContentResolver();
                FontFamily.Builder builder = null;
                for (C1199ms msVar : msVarArr) {
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(msVar.f26689a, "r", null);
                        if (openFileDescriptor != null) {
                            Font build3 = new Font.Builder(openFileDescriptor).setWeight(msVar.f26691c).setSlant(msVar.f26692d ? 1 : 0).setTtcIndex(msVar.f26690b).build();
                            if (builder != null) {
                                builder.addFont(build3);
                            } else {
                                builder = new FontFamily.Builder(build3);
                            }
                            try {
                                openFileDescriptor.close();
                            } catch (IOException e) {
                            }
                        } else {
                            continue;
                        }
                    } catch (IOException e2) {
                    } catch (Throwable th4) {
                        bqye.m113761a(th, th4);
                    }
                }
                if (builder != null) {
                    if ((i & 1) == 0) {
                        i3 = 400;
                    } else {
                        i3 = 700;
                    }
                    if ((i & 2) == 0) {
                        i8 = 0;
                    }
                    typeface = new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i3, i8)).build();
                } else {
                    typeface = null;
                }
                if (typeface != null) {
                    i2 = 0;
                } else {
                    i2 = -3;
                }
                return new C1200mt(typeface, i2);
            } else {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + mmVar2.f26677b);
            }
            throw th;
        } catch (PackageManager.NameNotFoundException e3) {
            return new C1200mt(null, -1);
        }
    }
}
