package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.FelicaException;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.response.SafeParcelResponse;
import com.google.android.gms.plus.service.DefaultChimeraIntentService;
import com.google.android.gms.plus.service.ImageChimeraIntentService;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: antw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class antw extends dck implements antx {

    /* renamed from: a */
    private final Context f77725a;

    /* renamed from: b */
    private final ClientContext f77726b;

    /* renamed from: c */
    private final ClientContext f77727c;

    /* renamed from: d */
    private final ryz f77728d;

    public antw() {
        super("com.google.android.gms.plus.internal.IPlusService");
    }

    /* renamed from: a */
    public final String mo42281a() {
        if (Process.myUid() != Binder.getCallingUid()) {
            int a = sfr.m35174a(this.f77725a, this.f77727c).mo25481a("android.permission.GET_ACCOUNTS");
            if (a == -2) {
                Log.w("PlusService", "Missing android.permission.GET_ACCOUNTS");
                return null;
            } else if (a == -1) {
                throw new SecurityException("Missing android.permission.GET_ACCOUNTS");
            }
        }
        return this.f77727c.mo17802b();
    }

    /* renamed from: b */
    public final void mo42287b(antk antk, String str) {
        DefaultChimeraIntentService.m68555a(this.f77725a, new aobd(this.f77727c, str, antk));
    }

    public antw(Context context, ClientContext clientContext, ClientContext clientContext2) {
        super("com.google.android.gms.plus.internal.IPlusService");
        this.f77725a = context;
        this.f77726b = clientContext;
        this.f77727c = clientContext2;
        this.f77728d = ryz.m34694a(context, 6400);
    }

    /* renamed from: a */
    public final void mo42282a(antk antk) {
        DefaultChimeraIntentService.m68555a(this.f77725a, new aobl(this.f77727c, antk));
    }

    /* renamed from: a */
    public final void mo42283a(antk antk, Uri uri, Bundle bundle) {
        int i;
        if (bundle != null) {
            i = bundle.getInt("bounding_box");
        } else {
            i = 0;
        }
        Context context = this.f77725a;
        ImageChimeraIntentService.f82608a.add(new aobw(this.f77728d, uri, i, antk));
        context.startService(spn.m35889g("com.google.android.gms.plus.service.image.INTENT").setClassName(context, "com.google.android.gms.plus.service.ImageIntentService"));
    }

    /* renamed from: a */
    public final void mo42284a(antk antk, SafeParcelResponse safeParcelResponse) {
        if (safeParcelResponse != null) {
            String sio = safeParcelResponse.toString();
            try {
                new JSONObject(sio);
                DefaultChimeraIntentService.m68555a(this.f77725a, new aoco(this.f77727c, sio, antk));
            } catch (JSONException e) {
                throw new IllegalArgumentException("momentJson must be valid JSON", e);
            }
        } else {
            throw new IllegalArgumentException("momentJson must not be empty");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public final void mo42285a(antk antk, String str) {
        sdo.m34966a((Object) str, (Object) "URL must not be null.");
        DefaultChimeraIntentService.m68555a(this.f77725a, new aobz(this.f77726b, str, antk));
    }

    /* renamed from: a */
    public final void mo42286a(antk antk, String str, String str2) {
        DefaultChimeraIntentService.m68555a(this.f77725a, new aobo(this.f77727c, str, str2, antk));
    }

    /* renamed from: a */
    public final void mo42280a(String str, FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shy shy = new shy(this.f77725a);
        shy.mo25576a(mo42281a());
        shy.mo25573a(favaDiagnosticsEntity);
        shy.mo25581c(favaDiagnosticsEntity2);
        shy.mo25582c(str);
        shy.mo25579b(this.f77727c.f30215e);
        DefaultChimeraIntentService.m68555a(this.f77725a, new anlo(this.f77725a, shy.mo25584e()));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dcl.a(android.os.Parcel, boolean):void
     arg types: [android.os.Parcel, int]
     candidates:
      dcl.a(android.os.Parcel, android.os.Parcelable$Creator):android.os.Parcelable
      dcl.a(android.os.Parcel, android.os.IInterface):void
      dcl.a(android.os.Parcel, android.os.Parcelable):void
      dcl.a(android.os.Parcel, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029c A[LOOP:0: B:96:0x0289->B:98:0x029c, LOOP_END] */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        antk antk;
        antk antk2;
        ArrayList<String> createStringArrayList;
        boolean z;
        int size;
        antk antk3;
        int i2 = i;
        Parcel parcel3 = parcel;
        Parcel parcel4 = parcel2;
        antk antk4 = null;
        if (i2 == 8) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (queryLocalInterface instanceof antk) {
                    antk4 = (antk) queryLocalInterface;
                } else {
                    antk4 = new anti(readStrongBinder);
                }
            }
            mo42282a(antk4);
            parcel2.writeNoException();
        } else if (i2 == 9) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (queryLocalInterface2 instanceof antk) {
                    antk4 = (antk) queryLocalInterface2;
                } else {
                    antk4 = new anti(readStrongBinder2);
                }
            }
            mo42283a(antk4, (Uri) dcl.m8163a(parcel3, Uri.CREATOR), (Bundle) dcl.m8163a(parcel3, Bundle.CREATOR));
            parcel2.writeNoException();
        } else if (i2 != 14) {
            if (i2 != 34) {
                switch (i2) {
                    case 1:
                        IBinder readStrongBinder3 = parcel.readStrongBinder();
                        if (readStrongBinder3 != null) {
                            IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                            if (queryLocalInterface3 instanceof antk) {
                                antk4 = (antk) queryLocalInterface3;
                            } else {
                                antk4 = new anti(readStrongBinder3);
                            }
                        }
                        mo42285a(antk4, parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 2:
                        IBinder readStrongBinder4 = parcel.readStrongBinder();
                        if (readStrongBinder4 != null) {
                            IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                            antk4 = queryLocalInterface4 instanceof antk ? (antk) queryLocalInterface4 : new anti(readStrongBinder4);
                        }
                        mo42286a(antk4, parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 3:
                        IBinder readStrongBinder5 = parcel.readStrongBinder();
                        if (readStrongBinder5 != null) {
                            IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                            if (queryLocalInterface5 instanceof antk) {
                                antk4 = (antk) queryLocalInterface5;
                            } else {
                                antk4 = new anti(readStrongBinder5);
                            }
                        }
                        mo42287b(antk4, parcel.readString());
                        parcel2.writeNoException();
                        break;
                    case 4:
                        mo42284a((antk) null, (SafeParcelResponse) dcl.m8163a(parcel3, SafeParcelResponse.CREATOR));
                        parcel2.writeNoException();
                        break;
                    case 5:
                        String a = mo42281a();
                        parcel2.writeNoException();
                        parcel4.writeString(a);
                        break;
                    case 6:
                        DefaultChimeraIntentService.m68555a(this.f77725a, new aobc(this.f77727c.f30215e));
                        parcel2.writeNoException();
                        break;
                    default:
                        switch (i2) {
                            case 16:
                                IBinder readStrongBinder6 = parcel.readStrongBinder();
                                if (readStrongBinder6 != null) {
                                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                    if (queryLocalInterface6 instanceof antk) {
                                        antk3 = (antk) queryLocalInterface6;
                                        int readInt = parcel.readInt();
                                        int readInt2 = parcel.readInt();
                                        int readInt3 = parcel.readInt();
                                        String readString = parcel.readString();
                                        sdo.m34959a(antk3);
                                        aobu aobu = new aobu(this.f77727c, readInt, readInt2, readInt3, readString, antk3);
                                        DefaultChimeraIntentService.m68555a(this.f77725a, aobu);
                                        aobt aobt = new aobt(aobu);
                                        parcel2.writeNoException();
                                        dcl.m8164a(parcel4, aobt);
                                        break;
                                    } else {
                                        antk4 = new anti(readStrongBinder6);
                                    }
                                }
                                antk3 = antk4;
                                int readInt4 = parcel.readInt();
                                int readInt22 = parcel.readInt();
                                int readInt32 = parcel.readInt();
                                String readString2 = parcel.readString();
                                sdo.m34959a(antk3);
                                aobu aobu2 = new aobu(this.f77727c, readInt4, readInt22, readInt32, readString2, antk3);
                                DefaultChimeraIntentService.m68555a(this.f77725a, aobu2);
                                aobt aobt2 = new aobt(aobu2);
                                parcel2.writeNoException();
                                dcl.m8164a(parcel4, aobt2);
                            case 17:
                                DefaultChimeraIntentService.m68555a(this.f77725a, new aoce(this.f77727c, parcel.readString()));
                                parcel2.writeNoException();
                                break;
                            case 18:
                                IBinder readStrongBinder7 = parcel.readStrongBinder();
                                if (readStrongBinder7 != null) {
                                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                    if (queryLocalInterface7 instanceof antk) {
                                        antk4 = (antk) queryLocalInterface7;
                                    } else {
                                        antk4 = new anti(readStrongBinder7);
                                    }
                                }
                                String readString3 = parcel.readString();
                                sdo.m34959a(antk4);
                                sdo.m34975b(!TextUtils.isEmpty(readString3), "The userId parameter is required.");
                                DefaultChimeraIntentService.m68555a(this.f77725a, new aobj(this.f77727c, readString3, antk4));
                                parcel2.writeNoException();
                                break;
                            case 19:
                                IBinder readStrongBinder8 = parcel.readStrongBinder();
                                if (readStrongBinder8 != null) {
                                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                    if (queryLocalInterface8 instanceof antk) {
                                        antk4 = (antk) queryLocalInterface8;
                                    } else {
                                        antk4 = new anti(readStrongBinder8);
                                    }
                                }
                                this.f77727c.mo17804b(this.f77725a);
                                DefaultChimeraIntentService.m68555a(this.f77725a, new aobc(this.f77727c.f30215e));
                                DefaultChimeraIntentService.m68555a(this.f77725a, new aocg(this.f77727c, antk4));
                                parcel2.writeNoException();
                                break;
                            default:
                                switch (i2) {
                                    case FelicaException.TYPE_PUSH_FAILED:
                                        IBinder readStrongBinder9 = parcel.readStrongBinder();
                                        if (readStrongBinder9 != null) {
                                            IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                            if (queryLocalInterface9 instanceof antk) {
                                                antk antk5 = (antk) queryLocalInterface9;
                                            } else {
                                                new anti(readStrongBinder9);
                                            }
                                        }
                                        parcel.readString();
                                        parcel2.writeNoException();
                                        break;
                                    case 41:
                                        parcel2.writeNoException();
                                        parcel4.writeString(null);
                                        break;
                                    case FelicaException.TYPE_ALREADY_ACTIVATED:
                                        parcel2.writeNoException();
                                        dcl.m8166a(parcel4, false);
                                        break;
                                    case FelicaException.TYPE_GET_BLOCK_COUNT_INFORMATION_FAILED:
                                        parcel2.writeNoException();
                                        parcel4.writeString(null);
                                        break;
                                    case FelicaException.TYPE_RESET_FAILED:
                                        IBinder readStrongBinder10 = parcel.readStrongBinder();
                                        if (readStrongBinder10 != null) {
                                            IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                            if (queryLocalInterface10 instanceof antk) {
                                                antk4 = (antk) queryLocalInterface10;
                                            } else {
                                                antk4 = new anti(readStrongBinder10);
                                            }
                                        }
                                        String readString4 = parcel.readString();
                                        sdo.m34959a(antk4);
                                        sdo.m34975b(!TextUtils.isEmpty(readString4), "The userId parameter is required.");
                                        DefaultChimeraIntentService.m68555a(this.f77725a, new aobk(this.f77727c, readString4, antk4));
                                        parcel2.writeNoException();
                                        break;
                                    case FelicaException.TYPE_GET_SYSTEM_CODE_LIST_FAILED:
                                        IBinder readStrongBinder11 = parcel.readStrongBinder();
                                        if (readStrongBinder11 != null) {
                                            IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                                            if (queryLocalInterface11 instanceof antk) {
                                                antk4 = (antk) queryLocalInterface11;
                                            } else {
                                                antk4 = new anti(readStrongBinder11);
                                            }
                                        }
                                        mo42284a(antk4, (SafeParcelResponse) dcl.m8163a(parcel3, SafeParcelResponse.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    case FelicaException.TYPE_GET_CONTAINER_ID_FAILED:
                                        mo42280a(parcel.readString(), (FavaDiagnosticsEntity) dcl.m8163a(parcel3, FavaDiagnosticsEntity.CREATOR), (FavaDiagnosticsEntity) dcl.m8163a(parcel3, FavaDiagnosticsEntity.CREATOR));
                                        parcel2.writeNoException();
                                        break;
                                    default:
                                        return false;
                                }
                        }
                }
            } else {
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                    if (queryLocalInterface12 instanceof antk) {
                        antk2 = (antk) queryLocalInterface12;
                        createStringArrayList = parcel.createStringArrayList();
                        sdo.m34959a(antk2);
                        sdo.m34959a(createStringArrayList);
                        if (createStringArrayList.size() <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        sdo.m34974b(z);
                        size = createStringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            sdo.m34969a(createStringArrayList.get(i3), (Object) "personId cannot be empty.");
                        }
                        DefaultChimeraIntentService.m68555a(this.f77725a, new aobi(this.f77727c, createStringArrayList, antk2));
                        parcel2.writeNoException();
                    } else {
                        antk4 = new anti(readStrongBinder12);
                    }
                }
                antk2 = antk4;
                createStringArrayList = parcel.createStringArrayList();
                sdo.m34959a(antk2);
                sdo.m34959a(createStringArrayList);
                if (createStringArrayList.size() <= 0) {
                }
                sdo.m34974b(z);
                size = createStringArrayList.size();
                while (i3 < size) {
                }
                DefaultChimeraIntentService.m68555a(this.f77725a, new aobi(this.f77727c, createStringArrayList, antk2));
                parcel2.writeNoException();
            }
        } else {
            IBinder readStrongBinder13 = parcel.readStrongBinder();
            if (readStrongBinder13 != null) {
                IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
                if (queryLocalInterface13 instanceof antk) {
                    antk = (antk) queryLocalInterface13;
                    int readInt5 = parcel.readInt();
                    String readString5 = parcel.readString();
                    Uri uri = (Uri) dcl.m8163a(parcel3, Uri.CREATOR);
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    sdo.m34959a(antk);
                    sdo.m34975b(!TextUtils.isEmpty(readString7), "The userId parameter is required.");
                    DefaultChimeraIntentService.m68555a(this.f77725a, new aobr(this.f77727c, readInt5, readString5, uri, readString6, readString7, "vault", antk));
                    parcel2.writeNoException();
                } else {
                    antk4 = new anti(readStrongBinder13);
                }
            }
            antk = antk4;
            int readInt52 = parcel.readInt();
            String readString52 = parcel.readString();
            Uri uri2 = (Uri) dcl.m8163a(parcel3, Uri.CREATOR);
            String readString62 = parcel.readString();
            String readString72 = parcel.readString();
            sdo.m34959a(antk);
            sdo.m34975b(!TextUtils.isEmpty(readString72), "The userId parameter is required.");
            DefaultChimeraIntentService.m68555a(this.f77725a, new aobr(this.f77727c, readInt52, readString52, uri2, readString62, readString72, "vault", antk));
            parcel2.writeNoException();
        }
        return true;
    }
}
