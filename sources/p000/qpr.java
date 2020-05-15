package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.chimera.debug.items.ModuleItem;
import com.google.android.gms.chimera.debug.items.ModuleSetItem;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: qpr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qpr {
    /* renamed from: a */
    public static Bundle m32627a(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        return arguments == null ? new Bundle() : arguments;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0190 A[RETURN] */
    /* renamed from: b */
    public static dky m32630b(Context context) {
        djz djz;
        ParcelFileDescriptor openFileDescriptor;
        Throwable th;
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder(65);
            sb.append("content://com.google.android.gms.chimera/api/");
            sb.append(-1L);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(sb.toString()), "r");
                if (openFileDescriptor == null) {
                    Log.e("ChimeraDebugUtils", "Config file descriptor is null");
                    djz = null;
                    if (djz == null) {
                        return null;
                    }
                    Set<String> stringSet = qpq.m32626a(context).f41922a.getStringSet("Chimera.starredModules", new C1225nr());
                    int c = djz.mo9177c();
                    for (int i = 0; i < c; i++) {
                        dka dka = new dka();
                        djy djy = new djy();
                        djz.mo9171a(dka, i);
                        djz.mo9170a(djy, dka.mo9183R());
                        if (!bmxx.m108577a(dka.mo9184b())) {
                            arrayList.add(new ModuleItem(1, dka.mo9184b(), dka.mo9186e(), djy.mo9155f(), djy.mo9149a(), djy.mo9153d(), djy.mo9156g(), djy.mo9157h(), stringSet.contains(dka.mo9184b())));
                        }
                    }
                    return dky.m8764b((Iterable) arrayList);
                }
                FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                if (fileDescriptor != null) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(fileDescriptor);
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, size);
                            map.order(ByteOrder.LITTLE_ENDIAN);
                            int i2 = ((int) size) - 32;
                            int i3 = i2 - 4;
                            int i4 = map.getInt();
                            if (i3 == i4) {
                                map.limit(i2);
                                if (djz.m8702b(map)) {
                                    djz = djz.m8701a(map);
                                    try {
                                        fileInputStream.close();
                                    } catch (IOException e) {
                                    }
                                    if (djz == null) {
                                        fileInputStream.close();
                                        try {
                                            openFileDescriptor.close();
                                        } catch (IOException e2) {
                                            djz = null;
                                        }
                                    } else if (djz.mo9168Q() == 15) {
                                        fileInputStream.close();
                                        try {
                                            openFileDescriptor.close();
                                        } catch (IOException e3) {
                                        }
                                        if (djz == null) {
                                        }
                                    } else {
                                        int Q = djz.mo9168Q();
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Chimera config has different version (current=15, stored=");
                                        sb2.append(Q);
                                        sb2.append(")");
                                        Log.w("ChimeraDebugUtils", sb2.toString());
                                        throw new InvalidConfigException("version mismatch");
                                    }
                                } else {
                                    throw new IOException("file identifier not found");
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder(50);
                                sb3.append("config size ");
                                sb3.append(i3);
                                sb3.append(" != prefix size ");
                                sb3.append(i4);
                                throw new IOException(sb3.toString());
                            }
                        } catch (IOException e4) {
                            try {
                                Log.w("ChimeraDebugUtils", "Error loading chimera config");
                                try {
                                    fileInputStream.close();
                                    djz = null;
                                } catch (IOException e5) {
                                    djz = null;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileInputStream.close();
                                throw th;
                            }
                        }
                    } catch (IOException e6) {
                        Log.e("ChimeraDebugUtils", "Exception while loading config file descriptor", e6);
                        openFileDescriptor.close();
                    } catch (Throwable th3) {
                        bqye.m113761a(th, th3);
                    }
                }
                djz = null;
                if (djz == null) {
                }
            } catch (SecurityException e7) {
                e = e7;
                Log.e("ChimeraDebugUtils", "Exception while loading config file descriptor", e);
                djz = null;
                if (djz == null) {
                }
            } catch (IOException e8) {
                e = e8;
                Log.e("ChimeraDebugUtils", "Exception while loading config file descriptor", e);
                djz = null;
                if (djz == null) {
                }
            }
        } catch (InvalidConfigException e9) {
            return null;
        } catch (Throwable th4) {
            Throwable th5 = th4;
            try {
                openFileDescriptor.close();
            } catch (IOException e10) {
            }
            throw th5;
        }
    }

    /* renamed from: a */
    public static dky m32628a(Context context) {
        Set set;
        qor qor;
        ArrayList arrayList = new ArrayList();
        ModuleManager moduleManager = ModuleManager.get(context);
        try {
            qpo qpo = new qpo(context.getSharedPreferences("ChimeraConfigService", 4));
            Set<String> stringSet = qpo.f41921a.getStringSet("Chimera.userModuleSetBlacklist", null);
            if (stringSet != null) {
                set = Collections.unmodifiableSet(stringSet);
            } else {
                set = bnon.f131923a;
            }
            try {
                byte[] a = sqd.m35966a(qpo.f41921a.getString("Chimera.moduleSetJournal", ""));
                if (a != null) {
                    qor = (qor) bxvk.m124016a(qor.f41889b, a, bxus.m123743b());
                    ModuleManager.ConfigInfo currentConfig = moduleManager.getCurrentConfig();
                    Map a2 = adyi.m51411a(currentConfig.moduleSets.size());
                    for (ModuleManager.ModuleSetInfo moduleSetInfo : currentConfig.moduleSets) {
                        bxvd da = qov.f41897f.mo74144da();
                        String str = moduleSetInfo.moduleSetId;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        qov qov = (qov) da.f164949b;
                        str.getClass();
                        int i = qov.f41899a | 1;
                        qov.f41899a = i;
                        qov.f41900b = str;
                        long j = moduleSetInfo.moduleSetVersion;
                        qov.f41899a = i | 2;
                        qov.f41901c = j;
                        bxvd da2 = qou.f41893c.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        qou qou = (qou) da2.f164949b;
                        qou.f41896b = 1;
                        qou.f41895a |= 1;
                        da.mo74069j(da2);
                        qov qov2 = (qov) da.mo74062i();
                        ModuleSetItem moduleSetItem = new ModuleSetItem(moduleSetInfo.moduleSetId, Long.valueOf(moduleSetInfo.moduleSetVersion), qoy.m32605a(qov2), set.contains(moduleSetInfo.moduleSetId), true);
                        arrayList.add(moduleSetItem);
                        String str2 = qov2.f41900b;
                        long j2 = qov2.f41901c;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 21);
                        sb.append(str2);
                        sb.append(":");
                        sb.append(j2);
                        a2.put(sb.toString(), moduleSetItem);
                    }
                    qpo.f41921a.getLong("Chimera.lastUpdateTime", 0);
                    for (qov qov3 : qor.f41891a) {
                        if (!"container".equals(qov3.f41900b)) {
                            String str3 = qov3.f41900b;
                            long j3 = qov3.f41901c;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 21);
                            sb2.append(str3);
                            sb2.append(":");
                            sb2.append(j3);
                            if (((ModuleSetItem) a2.get(sb2.toString())) == null) {
                                arrayList.add(new ModuleSetItem(qov3.f41900b, Long.valueOf(qov3.f41901c), qoy.m32605a(qov3), set.contains(qov3.f41900b), false));
                            }
                        }
                    }
                    return dky.m8764b((Iterable) arrayList);
                }
                throw new bxwf("Module set journal bytes are invalid!");
            } catch (bxwf | IllegalArgumentException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb3.append("Could not parse module set journal: ");
                sb3.append(valueOf);
                Log.e("ChimeraConfigPrefs", sb3.toString());
                qor = qor.f41889b;
            }
        } catch (InvalidConfigException e2) {
            Log.e("ChimeraDebugUtils", "Chimera module config error", e2);
        }
    }

    /* renamed from: a */
    public static String m32629a(String str) {
        return str != null ? str.replaceFirst("^com.google.android.gms.", "") : "";
    }
}
