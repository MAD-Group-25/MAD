package vn.edu.usth.wordpress25.ui.notifications;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.wordpress25.R;
import vn.edu.usth.wordpress25.databinding.FragmentNotificationsBinding;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
      // NotificationsViewModel notificationsViewModel =
        //        new ViewModelProvider(this).get(NotificationsViewModel.class);

        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

       // Toolbar toolbar = root.findViewById(R.id.toolbar);
        // Masquer la barre d'action dans ce fragment
       // ((AppCompatActivity) requireActivity()).setSupportActionBar(toolbar);
//        ActionBar actionBar = ((AppCompatActivity) requireActivity()).getSupportActionBar();
//        if (actionBar != null) {
//            actionBar.hide();
//        }
      //  ImageButton settingsButton = root.findViewById(R.id.settingsButton);
        //settingsButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
       //     public void onClick(View v) {
                // Ouvrir la page des paramètres
              //  Intent intent = new Intent(getActivity(), NotifSettings.class);
                //startActivity(intent);
//                Navigation.findNavController(v).navigate(R.id.notifSettings);
//            }
//        });


        //final TextView textView = binding.textNotifications;
        //notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        ViewPager viewPager = root.findViewById(R.id.viewPager);
        PagerAdapter pagerAdapter = new NotificationsPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(pagerAdapter);


        TabLayout tabLayout = root.findViewById(R.id.tabLayout);

        // Connectez le TabLayout au ViewPager
        tabLayout.setupWithViewPager(viewPager);
        return root;



    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_notification, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            // Ouvrir la page des paramètres ici
            Navigation.findNavController(requireView()).navigate(R.id.notifSettings);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}







